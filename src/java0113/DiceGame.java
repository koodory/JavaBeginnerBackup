package java0113;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		System.out.println("[ �ֻ��� ���� ]\n(Exit(����) : 0 �� �Է�)");
		Scanner scan = new Scanner(System.in);
		Random random = new Random( );
		
		while(true)
		{
			System.out.print("�����(1~6���� ���� �� �Է�) : ");
			int userNumber = scan.nextInt( );
			if(userNumber ==0)
				break;
			int comNumber = random.nextInt(6)+1;
			System.out.println("��ǻ���� �ֻ��� �� : "+comNumber);
			if(comNumber > userNumber)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			else if(comNumber == userNumber)
				System.out.println("�����ϴ�.");
			else
				System.out.println("����� �̰���ϴ�.");
		};
	}
}

