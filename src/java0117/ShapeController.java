package java0117;
import java.util.Scanner;


public class ShapeController {
	
	public void inputCircleConsole(Circle circle){ // �Ű������� Class�� ������ ����
		Scanner scan=new Scanner(System.in);
		System.out.print("�� ������ �Է�: ");
		circle.setR(scan.nextInt());
	}
	public void inputTriangleConsole(Triangle tri){
		Scanner scan=new Scanner(System.in);
		System.out.print("�� �غ� �Է�: ");
		tri.setW(scan.nextInt());
		System.out.print("�� ���� �Է�: ");
		tri.setH(scan.nextInt());		
	}
	public void inputRectangleConsole(Rectangle rect){
		Scanner scan=new Scanner(System.in);
		System.out.print("�� ���α��� �Է�: ");
		rect.setW(scan.nextInt());
		System.out.print("�� ���α��� �Է�: ");
		rect.setH(scan.nextInt());		
	}	
	public static void main(String[] args) {
		ShapeController controller=new ShapeController(); // inputConsole�� ���� ��ü��
		Scanner scan=new Scanner(System.in);
		System.out.println("<  ������ ���� ���ϱ�  >");
		System.out.print("�� ������(0:��, 1:�ﰢ��, 2:���簢��: ");
		int selectShape=scan.nextInt();
		if(selectShape==0){
			Circle circle=new Circle(); // circle��ü ��
			controller.inputCircleConsole(circle); // circle�� ������ ����
			circle.printResult();
		}else if(selectShape==1){
			Triangle tri=new Triangle(); // tri ��ü ��
			controller.inputTriangleConsole(tri); // triangle�� ������ ����
			tri.printResult();			
		}else if(selectShape==2){
			Rectangle rect=new Rectangle(); //rect ��ü��
			controller.inputRectangleConsole(rect); // rect�� ������ ����
			rect.printResult();			
		}else{
			System.out.println("OOPS~~~ ���� ������ �߸��ϼ̽��ϴ�.");
		}
	}
}
