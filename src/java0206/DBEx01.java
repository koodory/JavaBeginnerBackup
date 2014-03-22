package java0206;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBEx01 {

	public static Connection dbAccess() {
		Connection connect = null; //connect��ü�� ���ؼ� DB�� ����
		try{
			Class.forName("org.gjt.mm.mysql.Driver");	
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bitcomputer","root","apmsetup");
		} catch(ClassNotFoundException e){
		} catch(SQLException e){	
		}
		return connect;
	}
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.printf("\n �޴�(1:�˻�, 2:����) : ");
		String menu = scan.nextLine();
		String sql = null;
		System.out.printf("\n �˻�����(1:�̸� , 2:�ּ�) : ");
		String type = scan.nextLine();
		System.out.printf(" �˻��� �Է�(����) : ");
		String word = scan.nextLine();
		switch(menu){
		case "1": sql = "select * from student where name = 'Sam'";
				/*if(type.equals("1"))
					sql+="name like ";
				else if(type.equals("2"))
					sql+="addr like ";
				sql+="'%"+word+"'";
				System.out.println(sql);*/
				break;
		case "2": sql = "update into student from set";
		}
	
		Connection con=DBEx01.dbAccess();
		Statement stmt = con.createStatement(); //statement�� connector ��ü ����
		System.out.printf("\n==================================================\n");
		ResultSet rs=stmt.executeQuery(sql);// ���� ����,  �������� sql�� ���ǿ� ��� ��� �������� rs��
		String tab1 = null, tab2 = null;
		while(rs.next()){//Ư�� record�� ���������� ��������, ���� ������ true, ���� false
			if(rs.getString(1).length()<=7){
				tab1="\t\t"; tab2="\t"; }
			if(rs.getString(2).length()<=7)
				tab2="\t\t"; 
			else{
				tab1="\t"; tab2="\t";
			}
			System.out.print(rs.getString(1)+tab1);
			System.out.print(rs.getString(2)+tab2);
			System.out.print(rs.getString(3));
			System.out.println();
		}
		System.out.printf("\n==================================================");
	}
}
