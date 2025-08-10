package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_First_Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		{
			
//			int rollno = sc.nextInt();
//			String name = sc.next();
		//step-1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/db1";
		String username="root";
		String password="root";
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		
		String createDatabase=  "create database db1";
		
		Statement st = con.createStatement();
//		   int count=st.executeUpdate(createDatabase);
//		   System.out.println(count);
		
//		String createTable= "create table student(rollNo int , name varchar(100))";
//		   int count=st.executeUpdate(createTable);
//		   System.out.println(count);
		
//		String insertData = "insert into student(rollNo,name) values(1,'Wasif')";
//		st.executeUpdate(insertData);
		
		
//		String insertInputData = "insert into student(rollNo,name) values("+rollno+",'"+name+"')";
//		st.executeLargeUpdate(insertInputData);
		
//		String updateinput = "update student set rollNo="+rollno+" where name='"+name+"'";
//		st.executeUpdate(updateinput);
		
//		String deleteRow = "delete from student where rollno="+rollno;
//		st.executeUpdate(deleteRow);
		
			              st.close();
		}
	}
}
