package java0115;
import java.util.Scanner;

	public class Rectangle {
		private double width, height;

		public Rectangle(){
		}
		public Rectangle(double width, double height) {
			super();
			this.width = width;
			this.height = height;
		}
		
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public void inputConsole(){
			Scanner scan = new Scanner(System.in);
			System.out.print("�� ����(cm) : ");
			setWidth(scan.nextDouble());
			System.out.print("�� ����(cm) : ");
			setHeight(scan.nextDouble());
		}
		public double calcArea(){
			double area = getWidth() * getHeight() ; 
			return area;
		}
		public void printResult(){
			System.out.printf("�� ���簢���� ������ %.2f �� �Դϴ�. ",calcArea());
		}
		public static void main(String[] args) {
			Rectangle test = new Rectangle();
			System.out.println(test);
		}
		@Override
		public String toString() {
			return "Rectangle [width=" + width + ", height=" + height + "]";
		}
}

