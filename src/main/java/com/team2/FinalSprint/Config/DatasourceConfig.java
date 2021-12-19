package com.team2.FinalSprint.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

        @Bean
        @Primary
        @ConfigurationProperties(prefix="spring.datasource")
        public DataSource primaryDataSource() {
            return DataSourceBuilder.create().build();
        }

        @Bean
        @ConfigurationProperties(prefix="spring.seconddatasource")
        public DataSource secondaryDataSource() {
            return DataSourceBuilder.create().build();
        }

}
