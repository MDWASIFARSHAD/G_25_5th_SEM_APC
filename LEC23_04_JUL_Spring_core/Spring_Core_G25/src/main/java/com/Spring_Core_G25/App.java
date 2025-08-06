package com.Spring_Core_G25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
        
      Student s =(Student)  app.getBean("student");
      
      System.out.println(s.getId() + "  "+ s.getName()+ "  "+ s.getCourse()+ "  "+ s.getCourseAndTrainer());
     System.out.println(s.getAdd().getCity()+"  "+ s.getAdd().getState());
      
      
//      Address add = (Address) app.getBean("address");
//      System.out.println(add.getStreet()+  "  "+ add.getCity()+"   "+ add.getState());
    }
}
