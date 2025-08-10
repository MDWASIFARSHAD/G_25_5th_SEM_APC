package com.Spring_core_G_25_05_08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	
	@Bean
	public  Student student()
	{
		return new Student();
	}
	
	
	@Bean
	public Address address()
	{
		return new Address();
	}
	
	
}
