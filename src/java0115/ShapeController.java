package java0115;
import java.util.Scanner;

public class ShapeController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("< ���� ���� ���ϱ�>");
		while(true)
		{
			System.out.print("\n��������(0:��, 1:�ﰢ��, 2:���簢��) : ");
			int selectShape = scan.nextInt();
			if(selectShape == 0){
				Circle circle = new Circle();
				circle.inputConsole();
				circle.printResult();	
			}else if(selectShape == 1){
				Triangle tri = new Triangle();
				tri.inputConsole();
				tri.printResult();
			}else if(selectShape == 2){
				Rectangle rect = new Rectangle();
				rect.inputConsole();
				rect.printResult();
			}else{
				System.out.println("�߸� �����ϼ̽��ϴ�");
				continue;
			}
			System.out.print("\n��� �Ͻðڽ��ϱ�?(0:����) : ");
				int exit = scan.nextInt();
			if(exit == 0)
				break;
		}
	}
}
