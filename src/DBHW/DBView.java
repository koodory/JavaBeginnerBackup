package DBHW;

import java.sql.SQLException;

public class DBView{
	public DBView(){
	}
	public void viewMenu(){
		System.out.printf("=====[ MENU ]=====\n");
		System.out.println("1. ��ü�л�  �� ��");
		System.out.println("2. ������ �� ��");
		System.out.println("3. ������ �� �� ");
		System.out.println("4. ������ �� �� ");
		System.out.println("5. ������ �� ü ");
		System.out.println("0. �� ��");
		System.out.println("==================");
		System.out.printf("�� �޴� ���� : ");
	}
	public void viewSubTitle(int menu){
		String tag[] = {"[ �� �� ]","[ �� �� ]","[ �� �� ]","[ �� �� ]"};
		System.out.print("---");
		System.out.print(tag[menu]);
		System.out.printf ("---\n");	
	}
	public void viewSearchMenu(){
		System.out.println("  1. ��    �� ");
		System.out.println("  2. ��    ��");
		System.out.println("  3. ��ȭ��ȣ");
		System.out.println("--------------");
		System.out.printf("�� ���� : ");
	}
	public void inputMode(int select, int flag){
		String tag[] = {"ã��","�ٲ�","�Է���","������"};
		if(select == 1)
			System.out.print(tag[flag]+" �̸� �Է� : ");
		else if(select == 2)
			System.out.print(tag[flag]+" �ּ� �Է� : "); 
		else 
			System.out.print(tag[flag]+" ��ȭ��ȣ �Է� : "); 
	}
	public void showListTop() throws SQLException{
		System.out.printf("\n\t\t[ �� �� ]\n");
		System.out.println("-----------------------------------------------");
		System.out.printf("%-12s %-20s %-15s \n","name","address","tel");
		System.out.println("-----------------------------------------------");
	}
	public void showListBottom() throws SQLException{
		System.out.println("-----------------------------------------------\n");
	}
	public void viewEnd(){
		System.out.println("���α׷��� �����մϴ�.");
	}
}

