package Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import Entity.Student;

public class StudentDao {
	
	private JdbcTemplate jd;
	
	public JdbcTemplate getJd() {
		return jd;
	}

	public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}

	public void insert(Student s)
	{
		String query="insert into student(rollNo,name) values(?,?)";
		jd.update(query,s.getRollNo(),s.getName());
	}
	
	public void update(Student s)
	{
		String query="update student set name=? where rollNo=?";
		jd.update(query,s.getName(),s.getRollNo());
	}
	
	public void delete(Student s)
	{
		String query="delete from student where rollNo=?";
		jd.update(query,s.getRollNo());
	}
	
	public Student fetch(int rollno)
	{
		String query = "select * from Student where rollNo=?";
		Student s=jd.queryForObject(query, new Rw(),rollno);
		return s;
	}
	
	public List<Student> fetchAllRow()
	{
		String query = "select * from student";
	List<Student> s=	jd.query(query, new Rw());
	return s;
	}

}
