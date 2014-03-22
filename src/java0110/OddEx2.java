package java0110;
import java.util.Scanner;

public class OddEx2 {
	public static void main(String[] args){
		System.out.println("[ Ȧ, ¦�� ���߱� ]\n");
		System.out.print("* ������ �Է�(0 ~ 10) : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt( );

		switch(number){
		case 0: case 2: case 4: case 6: case 8: case 10:
			System.out.println("Ȧ, ¦�� ��� : ¦�� �Դϴ�.");
		break;
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("Ȧ, ¦�� ��� : Ȧ�� �Դϴ�.");
		break;
		default:
			System.out.println("�Է� ������ ������ϴ�.");
		}
	}
}
