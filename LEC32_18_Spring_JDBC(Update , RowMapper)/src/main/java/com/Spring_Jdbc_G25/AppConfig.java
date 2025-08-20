package com.Spring_Jdbc_G25;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	
	@Bean
	public DriverManagerDataSource datasource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.jdbc.cj.mysql.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/wasif");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate jd()
	{
		return new JdbcTemplate(datasource());
	}

}
