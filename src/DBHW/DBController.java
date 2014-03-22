package DBHW;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBController {
	static int menu,select;
	static String wordSearch = null, wordInput = null, sql = null;
	static Statement stmt = null;
	static Connection con = null;
	static Scanner scanInt = new Scanner(System.in);
	static Scanner scanStr = new Scanner(System.in); 
	static ResultSet rs;

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
	public static void setUpdate() throws SQLException{
		stmt = con.createStatement();
		stmt.executeUpdate(sql);
	}
	public static void setSearchSQL(int select){
		sql = "select * from student ";
		switch(select){
		case 1: sql += "where name like '%"+wordSearch+"%'"; break; 		
		case 2: sql += "where addr like '%"+wordSearch+"%'"; break;
		case 3: sql += "where tel like '%"+wordSearch+"%'"; break;
		}
	}
	public static void setMaintainSQL(int menu, int select){
		if(menu == 3){
			sql = "update student set ";
			switch(select){
			case 1: sql += "name='"+wordInput+"' where name='"+wordSearch+"'"; break;
			case 2: sql += "addr='"+wordInput+"' where addr='"+wordSearch+"'"; break;
			case 3: sql += "tel='"+wordInput+"' where tel='"+wordSearch+"'"; break;
			}
		}else if(menu == 4){ 
			switch(select){
			case 1: sql += "('"+wordInput+"','"; break; 
			case 2: sql += wordInput+"','"; break;
			case 3: sql += wordInput+"')"; break;
			} 
		}else{
			sql = "delete from student where name='"+wordInput+"'";
		}
		System.out.println(sql);
	}
	public static void getList() throws SQLException{
		stmt = con.createStatement();
		System.out.println(sql);
		rs = stmt.executeQuery(sql);
		DBModel dbm = new DBModel();
		DBView view = new DBView();
		view.showListTop();
		while(rs.next()){
		dbm.setName(rs.getString("name"));
		dbm.setAddr(rs.getString("addr"));
		dbm.setTel(rs.getString("tel"));
		System.out.printf("%-12s %-20s %-15s\n",dbm.getName(),dbm.getAddr(),dbm.getTel());
		}
		view.showListBottom();
	}
	
	public static void searchDB() throws SQLException{
		DBView view = new DBView();
		view.viewSubTitle(0);
		view.viewSearchMenu();
		select = scanInt.nextInt();
		view.inputMode(select,0);
		wordSearch = scanStr.nextLine();
		setSearchSQL(select);
		getList();
	}
	public static void modifyDB(int menu) throws SQLException{
		DBView view = new DBView();
		view.viewSubTitle((menu-2));
		view.viewSearchMenu();
		select = scanInt.nextInt();
		view.inputMode(select, 1);
		wordInput = scanStr.nextLine();
		setMaintainSQL(menu, select);
		setUpdate();
	}
	public static void InsertDB(int menu) throws SQLException{
		DBView view = new DBView();
		view.viewSubTitle((menu-2));
		System.out.println();
		sql = "insert into student values";
		for(int i=1 ; i<=3; i++){
			view.inputMode(i,2);
			wordInput=scanStr.nextLine();
			setMaintainSQL(menu, i);
		}
		setUpdate();
	}
	public static void deleteDB(int menu) throws SQLException{
		DBView view = new DBView();
		view.viewSubTitle((menu-2));
		System.out.println();
		view.inputMode(1,3);
		wordInput=scanStr.nextLine();
		setMaintainSQL(menu,0);
		setUpdate();
	}
	public static void main(String[] args) throws Exception{
		con = DBController.dbAccess(); 
		do{
			new DBView().viewMenu();	
			menu = scanInt.nextInt();
			System.out.println();
			switch(menu){
			case 1 : sql = "select * from student "; getList(); break;
			case 2 : searchDB(); break;
			case 3 : searchDB(); modifyDB(menu); break;
			case 4 : InsertDB(menu); break;
			case 5 : searchDB(); deleteDB(menu); break;
			case 0 : break;
		}System.out.println();
		}while(menu != 0);
			new DBView().viewEnd();
	}
}

