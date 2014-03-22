package java0113;
import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int i=1;
		System.out.print("�ݺ�Ƚ�� �Է� : ");
		Scanner scan = new Scanner(System.in);
		int iteration = scan.nextInt( );
		do{
			System.out.print(i+"\t");
			if(i%10 ==0)
				System.out.println( );
			i++;
		}while( i <= iteration );
	}
}

