package java0109;
import java.util.Scanner;


public class ModTest {

	public static void main(String[] args) {
		System.out.print("���� �Է� : "); // ln�� ���� ��� Ŀ���� ���� ��ġ
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // nextInt - ���ʹ����� ����� ��ȯ
		if((num%2)==0)
			System.out.println("Ȧ��, ¦�� ��� : ¦��");
		else
			System.out.println("Ȧ��, ¦�� ��� : Ȧ��");
	} 

}
