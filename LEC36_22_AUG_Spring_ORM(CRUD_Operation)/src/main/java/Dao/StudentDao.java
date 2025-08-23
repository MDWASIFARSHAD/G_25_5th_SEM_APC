package Dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import Entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insert(Student student)
	{
		//logic
		hibernateTemplate.save(student);	
	}
	
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public Student fetch()
	{
		Student s=hibernateTemplate.get(Student.class,1);
		return s;
	}
	
	@Transactional
	public void update(Student student)
	{
		hibernateTemplate.update(student);
	}
	
	@Transactional
	public void delete(Student s)
	{
		hibernateTemplate.delete(s);
	}
	
	
	
	}


