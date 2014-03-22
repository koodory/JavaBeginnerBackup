package java0114;
import java.util.Scanner;

public class RunMakeMan {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("[ ���� ��� ������ ]");
		String name, skinColor, gender;
		Double weight, height;
		int exit;
		Man man;
		while(true){
			System.out.println("====================================");
			System.out.print("���� : ");
			name=scan.next(); //nextLine()�� �ٹٲ� ���ڱ��� ����
			System.out.print("�Ǻλ�: ");
			skinColor = scan.next();
			System.out.print("����: ");
			gender = scan.next();
			System.out.print("������: ");
			weight = scan.nextDouble();
			System.out.print("Ű: ");
			height = scan.nextDouble();
			man=new Man(name,skinColor,gender,weight,height);
			System.out.println("����� ������ "+man.getName()+"�Դϴ�.");
			System.out.println("����� Ű�� "+man.getHeight()+"Cm �Դϴ�.");
			System.out.println("����� �����Դ� "+man.getWeight()+"Kg �Դϴ�.");
			System.out.print(man.getName());
			man.wakeUp();
			System.out.print(man.getName());
			man.walk();
			System.out.print(man.getName());
			man.sleep();
			System.out.print("���Ῡ��[����� 0, ����� 1] : ");
			exit = scan.nextInt();
			if(exit == 0)
				break;
		} 
	}
}
