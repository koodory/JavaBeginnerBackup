package java0205;
import java.sql.*;

 

public class ConnectTestDB {

 

 public static void main(String[] args) {
  
  Connection conn;
  Statement stmt;
  
  try {
   Class.forName("com.mysql.jdbc.Driver");//����̹� �ε�: DriverManager�� ���
  }catch(ClassNotFoundException e) {
   System.err.print("ClassNotFoundException: ");
  }
  
  try {
   String jdbcUrl = "jdbc:mysql://localhost:3306/sdh";//����ϴ� �����ͺ��̽����� ������ url
   String userId = "root";//����ڰ���
   String userPass = "apmsetup";//����� �н�����
   
   conn = DriverManager.getConnection(jdbcUrl, userId, userPass);//Connection ��ü�� ��
   
   stmt = conn.createStatement();//Statement ��ü�� ��
   
   System.out.println("����� ����Ǿ���ϴ�");//����� ȭ�鿡 ǥ�õ�
   
   stmt.close();
   conn.close();
  }catch(SQLException e) {
   System.out.println("SQLException: " + e.getMessage());
  } 
 }
}



