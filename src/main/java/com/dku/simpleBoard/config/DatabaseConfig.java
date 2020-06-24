package com.dku.simpleBoard.config;

import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.mybatis.spring.annotation.*;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;

import org.apache.ibatis.session.SqlSessionFactory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.dku.simpleBoard.mapper",
        sqlSessionFactoryRef = "sqlSessionFactory")
public class DatabaseConfig {

    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public DataSource DataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(
            @Qualifier("dataSource") DataSource dataSource,
            ApplicationContext applicationContext) throws Exception {

        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResource("mapper/**/*.xml"));

        return sqlSessionFactory.getObject();
    }

    @Bean(name = "sqlSession")
    public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}



/*
@Configuration
@PropertySource("classpath:/application.properties")
@MapperScan(basePackages = "com.dku.simpleBoard")
public class DatabaseConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariConfig hikariConfig() {
        return new HikariConfig();
    }

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new HikariDataSource(hikariConfig());
        return dataSource;
    }

    @Autowired
    private ApplicationContext applicationContext;
*/

//    @Bean
//   public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//      SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//     sqlSessionFactoryBean.setDataSource(dataSource);
//     sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mapper/**/*.xml"));
//     return sqlSessionFactoryBean.getObject();
// }

// @Bean
// public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//     return new SqlSessionTemplate(sqlSessionFactory);
// }
//}

