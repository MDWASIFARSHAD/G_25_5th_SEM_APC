package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementExample {
	
	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/db1";
		String username="root";
		String password="root";

           /*    String createProc = 
    "DELIMITER $$ " +
    "CREATE PROCEDURE add_numbers(IN r INT,  OUT n varchar(100)) " +
    "BEGIN " +
    "   select name as n from Student where rollNo=r" +
    "END $$ " +
    "DELIMITER ;";
*/
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		CallableStatement cs = con.prepareCall("{call getName(?,?)}");
		cs.setInt(1, 3);
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.execute();
		String name =cs.getString(2);
		System.out.println(name);
	}

}
