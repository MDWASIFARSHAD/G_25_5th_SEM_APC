package com.Spring_Jdbc_G25;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.StudentDao;
import Entity.Student;

public class MainClass {
	
	
	public static void main(String[] args) {
		
     ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
     StudentDao studentdao = (StudentDao)app.getBean("studentdao");
     
     Student student=(Student)app.getBean("student");

     studentdao.insert(student);
     
    Student s1=studentdao.fetch(4);
    System.out.println(s1.getRollNo()+"" +s1.getName());
    
    
   List<Student> s2= studentdao.fetchAllRow();
   for(Student s:s2)
   {
	   System.out.println(s.getRollNo()+"  "+s.getName());
   }
	}
	
	

}
