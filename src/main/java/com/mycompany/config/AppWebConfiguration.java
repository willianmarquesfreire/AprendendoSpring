package com.mycompany.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.util.Properties;
import javax.security.auth.login.Configuration;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@ComponentScan(basePackages = {"com.mycompany.controllers"})
public class AppWebConfiguration {
    
    private HikariConfig commonConfig() {
        HikariConfig config = new HikariConfig();
        config.setMaximumPoolSize(20);
        config.setIdleTimeout(30000L);
        config.setInitializationFailFast(true);
        config.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
        config.addDataSourceProperty("url","jdbc:mysql://localhost:3306/aprendendospring");
        config.addDataSourceProperty("user","root");
        config.addDataSourceProperty("password","senha");
        return config;
    }
    
    private Properties commonProperties() {
        Properties properties = new Properties();
        properties.setProperty("eclipselink.weaving", "false");
        properties.setProperty("hibernate.ejb.naming_strategy", "org.hibernate.cfg.EJB3NamingStrategy");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.format_sql", "false");
        properties.setProperty("hibernate.connection.charSet", "UTF-8");
        properties.setProperty("hibernate.connection.characterEncoding", "UTF-8");
        properties.setProperty("hibernate.connection.useUnicode", "true");
        properties.setProperty("hibernate.jdbc.batch_size", "50");
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        return properties;
    }
    
    @Bean
    public DataSource dataSource() {
        HikariConfig config = commonConfig();
        return new HikariDataSource(config);
    }
    
    @Bean
    @Autowired
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.mycompany.models");
        factory.setDataSource(dataSource);
        factory.setJpaProperties(commonProperties());
        factory.afterPropertiesSet();
        return factory;
    }
}
