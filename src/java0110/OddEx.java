package java0110;
import java.util.Scanner;

public class OddEx {

	public static void main(String[] args) {
		System.out.println("[ Ȧ, ¦�� ���߱� ]\n");
		System.out.print("* ������ : ");
		Scanner scan = new Scanner(System.in);
		// ��ü��: Ŭ���������� �޸𸮿� �Ҵ�, new�� ������, Scanner�� ����,
		// scan�� ��ü�� �����ϴ� remote controller value
		int number = scan.nextInt( );
		// ��ȯ(�Է��� �����ؼ� ���͸� ������ ������� �Է°��� number�� �Է�
		
		switch(number % 2){
		case 0:
			System.out.println("Ȧ, ¦�� ��� : ¦�� �Դϴ�.");
		break;
		case 1:
			System.out.println("Ȧ, ¦�� ��� : Ȧ�� �Դϴ�.");
		break;
		default:
		}
	}
}
