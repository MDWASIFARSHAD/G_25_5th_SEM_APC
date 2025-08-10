package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_08_08 {
	
	public static void main(String[] args) throws SQLException {
		
		
		String url="jdbc:mysql://localhost:3306/db1";
		String username="root";
		String password="root";
		
		Connection con=DriverManager.getConnection(url,username,password);
		
//		Statement st = con.createStatement();
		
//		String query = "select * from student";
//		 ResultSet rs=    st.executeQuery(query);
//		 
//		 while(rs.next())
//		 {
//			 System.out.println(rs.getInt(1)+  "   "+ rs.getString(2));
//		 }
		              
	
//		
//		
//		String query1="insert into student(rollNo,name) values(10,'ritik')";
//		String query2="update student set rollNo=21 where name='ritik'";
//		String query3="delete from student where name='shubham'";
//		String query4="insert into student(rollNo,name) values(11,'rohit')";
//		
//		st.addBatch(query1);
//		st.addBatch(query2);
//		st.addBatch(query3);
//		st.addBatch(query4);
//		
//		int[] count=st.executeBatch();
//		System.out.println(count.length);
		
		
		
		PreparedStatement ps = con.prepareStatement("insert into student(rollNo,name) values(?,?)");
		ps.setInt(1, 101);
		ps.setString(2, "cos");
		ps.executeUpdate();
		
		ps.setInt(1, 102);
		ps.setString(2, "king");
		ps.executeUpdate();
		
		ps.setInt(1, 103);
		ps.setString(2, "abcd");
		ps.executeUpdate();
		
		
		
		
		ps.close();
		
		
	}

}
