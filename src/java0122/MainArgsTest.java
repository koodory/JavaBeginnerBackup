package java0122;
import java.util.Scanner;

public class MainArgsTest {
	public static void	main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� :");
		String name= scan.nextLine();
		if(name.equals("�ΰ���"))
			System.out.println("�����̴�.");
		else
			System.out.println("�л��̴�.");
	}
}
