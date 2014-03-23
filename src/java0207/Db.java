package java0207;

import java.sql.*;

public class Db {
	
	public static Connection abAccess(){
		Connection connect = null; //connect��ü�� ���ؼ� DB�� ����
		try{
			Class.forName("org.gjt.mm.mysql.Driver");	
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","apmsetup");
		} catch(ClassNotFoundException e){
			System.out.println(e);
		} catch(SQLException e){	
		}
		return connect;
	}
}
