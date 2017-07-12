package com.athena.utils;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.math.NumberUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;

/**
 * Created by yangsheng on 2017/6/4.
 */
@Data
@Slf4j
public class RedisUtil<T> {

    protected static JedisPool jedisPool = null;

    private String ip;
    private String port;
    private String max_connection;
    private String max_idle;
    private String min_idle;
    private String max_wait_time;
    private String test_onBorrow;
    private String time_out;

    private static Jedis jedis;

    public RedisUtil() {
    }

    public RedisUtil(String ip, String port, String max_connection, String max_idle,
                     String min_idle, String max_wait_time, String test_onBorrow, String time_out) {
        this.ip = ip;
        this.port = port;
        this.max_connection = max_connection;
        this.max_idle = max_idle;
        this.min_idle = min_idle;
        this.max_wait_time = max_wait_time;
        this.test_onBorrow = test_onBorrow;
        this.time_out = time_out;
    }

    public void init() {
        // 操作超时时间,默认2秒
        int timeout = NumberUtils.toInt(time_out);
        // jedis池最大连接数总数，默认8
        int maxTotal = NumberUtils.toInt(max_connection);
        // jedis池最大空闲连接数，默认8
        int maxIdle = NumberUtils.toInt(max_idle);
        // jedis池最少空闲连接数
        int minIdle = NumberUtils.toInt(min_idle);
        // jedis池没有对象返回时，最大等待时间单位为毫秒
        long maxWaitMillis = NumberUtils.toLong(max_wait_time);
        // 在borrow一个jedis实例时，是否提前进行validate操作
        boolean testOnBorrow = Boolean.parseBoolean(test_onBorrow);

        // 设置jedis连接池配置
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(maxTotal);
        poolConfig.setMaxIdle(maxIdle);
        poolConfig.setMinIdle(minIdle);
        poolConfig.setMaxWaitMillis(maxWaitMillis);
        poolConfig.setTestOnBorrow(testOnBorrow);

        try {
            log.info("redis config information:{}", JSON.toJSONString(poolConfig));
            jedisPool = new JedisPool(poolConfig, ip, Integer.parseInt(port), timeout);
            jedis = jedisPool.getResource();
            log.info("get redis success");
        } catch (Exception e) {
            log.error("init redis pool failed, ip:{},port:{},", ip, port);
            throw new RuntimeException("init redis pool failed");
        }
    }

    public static String set(final String key, final String value) {
        return jedis.set(key, value);
    }

    public static String set(final byte[] key, byte[] value) {
        return jedis.set(key, value);
    }

    public static String get(final String key) {
        return jedis.get(key);
    }

    public static byte[] get(final byte[] key) {
        return jedis.get(key);
    }

    public static long incr(final String key) {
        return jedis.incr(key);
    }

    public static long decr(final String key) {
        return jedis.decr(key);
    }
}
