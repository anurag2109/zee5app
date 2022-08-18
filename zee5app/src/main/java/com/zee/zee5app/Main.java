package com.zee.zee5app;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Properties;

import javax.naming.InvalidNameException;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zee.zee5app.config.Config;
import com.zee.zee5app.config.Config2;
import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.User;
import com.zee.zee5app.enums.Geners;
import com.zee.zee5app.exceptions.InvalidIdException;
import com.zee.zee5app.exceptions.UnableToGenerateIdException;
import com.zee.zee5app.repo.MovieRepository;
import com.zee.zee5app.repo.UserRepo;
import com.zee.zee5app.service.MovieService;
import com.zee.zee5app.service.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		DataSource properties = applicationContext.getBean("dataSource", BasicDataSource.class);
		DataSource properties1 = applicationContext.getBean("dataSource2", BasicDataSource.class);
		System.out.println(properties != null);
		System.out.println(properties1 != null);
	}

}
