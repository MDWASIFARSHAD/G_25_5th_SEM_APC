package com.Spring_core_G_25_05_08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
       
       Student s = (Student) app.getBean(Student.class);
       System.out.println(s.getId()+"  "+ s.getCourse());
    }
}
