package com.SPring_core_G_25_06_08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.SpringBean.Hello;

/**
 * Hello world!
 *
 */

@ComponentScan("com.SPring_core_G_25_06_08")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new AnnotationConfigApplicationContext(App.class);
        
        Student s = (Student) app.getBean(Student.class);
        System.out.println(s.getAdd().getCity());
        
        
        
        System.out.println(s.getId());
        
        Hello h = (Hello) app.getBean(Hello.class);
    }
}
