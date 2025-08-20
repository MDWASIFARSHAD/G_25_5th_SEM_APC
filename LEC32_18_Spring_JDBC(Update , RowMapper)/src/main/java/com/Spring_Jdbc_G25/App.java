package com.Spring_Jdbc_G25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
//         JdbcTemplate temp=(JdbcTemplate) app.getBean("jdbctemplate");
//         
//         String query = "insert into student(rollNo,name) values(?,?)";
//         temp.update(query,1,"koshi");
    	
    	ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
    	  JdbcTemplate template= app.getBean(JdbcTemplate.class);
    	  String query = "insert into student(rollNo,name) values(?,?)";
    	  template.update(query,1,"koshi");
    }
}
