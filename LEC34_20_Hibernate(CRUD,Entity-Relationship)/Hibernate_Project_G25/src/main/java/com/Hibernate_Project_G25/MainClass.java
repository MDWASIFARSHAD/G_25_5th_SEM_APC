package com.Hibernate_Project_G25;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Answer;
import Entity.Question;
import Entity.Student;

public class MainClass {
	
	public static void main(String[] args) {
		
		 Configuration cf = new Configuration();
	        cf.configure("hiber.cfg.xml");
	        SessionFactory sf = cf.buildSessionFactory();
	        
	        Question q = new Question();
	        q.setQid(1);
	        q.setQuestion("What is Java");
	        
	        Answer a = new Answer();
	        a.setAid(101);
	        a.setAnswer("Java is porgramming lanaguage");
	        
	        q.setAnswer(a);
	        
	        Session session = sf.openSession();
	        session.beginTransaction();
	        session.save(a);
	        session.save(q);
	        session.getTransaction().commit();
	        session.close();
	}

}
