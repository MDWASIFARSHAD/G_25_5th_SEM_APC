package com.Spring_ORM_G25;

import org.hibernate.Hibernate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import Dao.StudentDao;
import Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	 ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
    	   StudentDao  studentdao=  (StudentDao) app.getBean("studentdao");
    	   
    	     HibernateTemplate h=  (HibernateTemplate) app.getBean("hibernateTemplate");
    	   
//    	   Student s=studentdao.fetch();
//    	   System.out.println(s.getSid()+"   "+s.getSname());
    	   
//    	   Student s= new Student();
//    	   s.setSid(2);
//    	   s.setSname("Harsh");
//    	   studentdao.insert(s);
    	     
//    	  Student s= h.get(Student.class, 1);
//    	  s.setSname("Vansh");
//    	  studentdao.update(s);
    	     
    	 Student s=    h.get(Student.class, 2);
    	 studentdao.delete(s);
    	   
    	   
    	      
    	   
    }
}
