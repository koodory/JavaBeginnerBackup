package java0123.examples;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է�(10���� ���� ����) : ");
		int num=scan.nextInt();
		try{
			if(num>=10)
				throw new NullPointerException();//����Ŭ���� ���Ͽ� �������� �߻�
		}catch(NullPointerException e){
			System.out.println("10���� ū ���� �Է� �Ǿ�׿�");
		}
	}
}
