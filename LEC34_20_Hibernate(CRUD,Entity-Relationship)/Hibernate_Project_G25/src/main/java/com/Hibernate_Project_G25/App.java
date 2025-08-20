package com.Hibernate_Project_G25;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cf = new Configuration();
        cf.configure("hiber.cfg.xml");
        
        Student s= new Student(1,"wasif",60000);
        
        SessionFactory sf = cf.buildSessionFactory();
        
//        Session session = sf.openSession();
//        
////        session.beginTransaction();
////        session.save(s);
////        session.getTransaction().commit();
////        session.close();
//        
        
           //read
//          Student student=    session.get(Student.class, 1);
//          System.out.println(student.getRollNo()+"  "+ student.getName()+"  "+ student.getSalary());
           
        
        
        
           //read
            Session session = sf.openSession();
            Student student=    session.get(Student.class, 1);
//            session.beginTransaction();
//            student.setName("Rohit");
//            student.setSalary(70000);
//            session.update(student);
//            session.getTransaction().commit();
            
            
            //delete
            session.beginTransaction();
            session.delete(student);
            session.getTransaction().commit();
            session.close();
          
          
    }
}
