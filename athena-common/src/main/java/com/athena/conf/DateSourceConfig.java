package com.athena.conf;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by yangsheng on 2017/7/3.
 */

@Configuration
@EnableTransactionManagement
@Data
public class DateSourceConfig implements EnvironmentAware {

    private RelaxedPropertyResolver propertyResolver;

    @Bean(name = "dataSource")
    @Primary
    public DataSource writeDataSource() {

        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(propertyResolver.getProperty("url"));
        datasource.setDriverClassName(propertyResolver.getProperty("driver-class-name"));
        datasource.setUsername(propertyResolver.getProperty("username"));
        datasource.setPassword(propertyResolver.getProperty("password"));

        return datasource;
    }

    @Override
    public void setEnvironment(Environment env) {
        this.propertyResolver = new RelaxedPropertyResolver(env, "spring.dataSource.");
    }
}
