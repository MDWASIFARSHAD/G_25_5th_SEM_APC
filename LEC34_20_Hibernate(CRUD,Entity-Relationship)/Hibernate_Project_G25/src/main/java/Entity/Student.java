package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class Student {
	
	
	@Column(name = "Student_RollNo")
	@Id
	private int rollNo;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int rollNo, String name, int salary) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Column(name = "Student_Name")
	private String name;
	
	
	@Column(name = "Student_Salary")
	private int salary;

}
