package com.zee.zee5app.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@Import(Config2.class)
@ComponentScan(basePackages = "com.zee.zee5app")
@PropertySource(value = "application.properties")
public class Config {
	
	@Autowired
	Environment environment; // this will help to read or get the property content(that means retrieval part)
	
	//datasource -----> get the connection object
	@Bean("dataSource")
	public DataSource getDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUsername(environment.getProperty("db.username"));
		basicDataSource.setUrl(environment.getProperty("db.url"));
		basicDataSource.setPassword(environment.getProperty("db.password"));
		return basicDataSource;
	}
	
}
