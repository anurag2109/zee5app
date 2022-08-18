package com.zee.zee5app.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class Config2 {
	@Autowired
	Environment environment;
	
	@Bean("dataSource2")
	public DataSource getDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUsername(environment.getProperty("db.username"));
		basicDataSource.setUrl(environment.getProperty("db.url"));
		basicDataSource.setPassword(environment.getProperty("db.password"));
		return basicDataSource;
	}
}
