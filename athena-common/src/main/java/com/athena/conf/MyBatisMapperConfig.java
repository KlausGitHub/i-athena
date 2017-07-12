package com.athena.conf;

/**
 * Created by yangsheng on 2017/7/3.
 */

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis扫描接口
 */
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperLocation = new MapperScannerConfigurer();
        mapperLocation.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperLocation.setBasePackage("com.athena.mapper");
        return mapperLocation;
    }

}