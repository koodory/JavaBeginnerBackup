package java0113;
import java.util.Scanner;

public class YearCount {

	public static void main(String[] args) {
		System.out.println("[ ���� ��� ���α׷� ]");
		System.out.println(" Exit : 0");
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.print("�⵵ �Է� : ");
			int year = scan.nextInt( );
			if(year == 0){
				System.out.println("����");
				break;
			}
			else if(year%4 == 0){
				if(year%100 == 0){
					if(year%400 ==0)
						System.out.println(year+"�⵵�� �����Դϴ�!");
					else
						System.out.println(year+"�⵵�� ������ �ƴմϴ�!");
				}else{
					System.out.println(year+"�⵵�� �����Դϴ�!");
				}
			}else{
				System.out.println(year+"�⵵�� ������ �ƴմϴ�!");
			}
		}
	}
}
