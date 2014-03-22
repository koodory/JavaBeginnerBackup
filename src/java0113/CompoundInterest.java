package java0113;
import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args){
		System.out.println("< ���� ���� >");
		System.out.println("=== Exit (����) : 0 === ");
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("��ġ�ݾ� : ");
			int money = scan.nextInt( );
			System.out.print("��ġ�Ⱓ : ");
			int year = scan.nextInt( );
			System.out.print("��������(%) : ");
			double interest = scan.nextDouble( );
			int sum = (int) (money * (Math.pow(1+(interest/100),year)));
			System.out.println("�����"+year+"�� �� "+sum+"���� ������ �� �ֽ��ϴ�");
		}
	}
}
