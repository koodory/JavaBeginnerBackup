package java0205;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	
	public static Connection dbAccess() {
		Connection connect = null; //connect��ü�� ���ؼ� DB�� ����
		try{
			Class.forName("org.gjt.mm.mysql.Driver");	
			System.out.println("JDBC ����̹� �޸𸮿� �ε�");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bitcomputer","root","apmsetup");
			System.out.println("���������� DB�� �����");
		} catch(ClassNotFoundException e){
		} catch(SQLException e){	
		}
		return connect;
	
	}
	public static void main(String[] args) throws SQLException{
		Connection con = DBTest.dbAccess();
		Statement stmt = con.createStatement();
		String sql = "select * from student where name like '%Sam'";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			for(int i=1;i<=3;i++){
				System.out.print(rs.getString(i)+"\t");
			}
		}
	}

	
}
