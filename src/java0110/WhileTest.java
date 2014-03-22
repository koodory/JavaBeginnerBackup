package java0110;
import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		System.out.println("������ ��µ� ���� �Է� : ");
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int lastNumber = scan.nextInt( );
		if(lastNumber ==0)
			return;
		
		while (true){
			System.out.print(i+"\t");
			
			if(i%10 == 0)
				System.out.println( );
			
			if(i == lastNumber)
				break;
			
			i++;
		}
	}

}
