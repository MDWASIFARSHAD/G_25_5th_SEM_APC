package Dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import Entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	public void insert(Student student)
	{
		//logic
		hibernateTemplate.save(student);
		
		
	}

}
