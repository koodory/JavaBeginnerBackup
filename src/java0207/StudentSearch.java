package java0207;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentSearch extends JFrame{
	JLabel name;
	JTextField  t_name;
	JButton search;
	Statement st;
	ResultSet rs;
	String searchText=" ";
	String [] s_studno, s_name, s_userid, s_grade, s_idnum, s_birthdate, s_tel, s_dname;
	JPanel pan;
	JScrollPane searchPart, sp;
	JTable table;
	String fieldName[] = {"학번","이름","아이디","학년","주민번호","생년월일","전화번호","전공"};
	String data[][];
	DefaultTableModel model; //Table�� ��ü����
	
	StudentSearch() throws SQLException{
		super("학적부 검색");

		System.out.println(searchText);
		name= new JLabel("검색할 이름");
		t_name = new JTextField(15);
		search = new JButton("검색");
		search.addMouseListener(new SearchHandler());
		pan= new JPanel();
		pan.add(name); pan.add(t_name); pan.add(search);
		model = new DefaultTableModel(fieldName,0){
			@Override
			public boolean isCellEditable(int row, int column){//��µǴ� cell ������ ����
				return false;
			}
		};
		exSQL();
		
		searchPart = new JScrollPane(pan);
		table = new JTable(model);
		sp = new JScrollPane(table);

		setTable();

		add(searchPart,BorderLayout.NORTH);
		add(sp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,700,500);
		setVisible(true);
	}
	
	void setTable(){
		
		model.setRowCount(s_name.length);
		
		for(int i=0;i<table.getRowCount();i++){
			if(i<s_name.length){
				table.setValueAt(s_studno[i],i,0);
				table.setValueAt(s_name[i],i,1);
				table.setValueAt(s_userid[i],i,2);
				table.setValueAt(s_grade[i],i,3);
				table.setValueAt(s_idnum[i],i,4);
				table.setValueAt(s_birthdate[i],i,5);
				table.setValueAt(s_tel[i],i,6);
				table.setValueAt(s_dname[i],i,7);
			}
		}
	} 
		
	void exSQL(){
		searchText=t_name.getText();
		Connection connect=Db.abAccess();
		try{
			st = connect.createStatement();
			String sql = "select * from student where name like '"+searchText.trim()+"%'"; //trim() �յ� ��� ����
			String sql2 = "select count(*) from student where name like '"+searchText.trim()+"%'"; //�����ϴ� ������ ����
			rs=st.executeQuery(sql2);
			rs.next(); //������
			int count=rs.getInt(1); //�迭 ���� ���ϱ�;
			System.out.println("자료의 개수 :"+count);
			rs = st.executeQuery(sql);
			s_studno=new String[count];
			s_name=new String[count];
			s_userid=new String[count];
			s_grade=new String[count];
			s_idnum=new String[count];
			s_birthdate=new String[count];
			s_tel=new String[count];
			s_dname=new String[count];
			int i=0;
			while(rs.next()){
				s_studno[i]=rs.getString("studno");
				s_name[i]=rs.getString("name");
				s_userid[i]=rs.getString("userid");
				s_grade[i]=rs.getInt("grade")+"";
				s_idnum[i]=rs.getString("idnum");
				s_birthdate[i]=rs.getString("birthdate");
				s_tel[i]=rs.getString("tel");
				s_dname[i]=rs.getString("dname");
				i++;
			}
		}catch(SQLException se){
			System.out.println(se);
		}finally{
			try{
				if(rs!=null)rs.close();
				if(st!=null)st.close();
				if(connect!=null)connect.close();
			}catch(SQLException se){}
		}
	}
	public static void main(String[] args) throws SQLException {
		new StudentSearch();
	}
		//implement MouseListener�� ����� ���콺 ��� ���� ���μ����� �� �����ؾ� ��
	class SearchHandler extends MouseAdapter{ //����Ŭ���� : �ܺ��ڿ��� ������, ��ư Ŭ���� callback
		public void mouseClicked(MouseEvent me){ 
			exSQL();
			setTable();
			t_name.setText("");
		}
	}

}
