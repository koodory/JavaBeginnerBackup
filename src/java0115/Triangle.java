package java0115;
import java.util.Scanner;

	public class Triangle {
		private double baseLine, height;

		public Triangle(){
		}
		public Triangle(double baseLine, double height) {
			super();
			this.baseLine = baseLine;
			this.height = height;
		}
		
		public double getBaseLine() {
			return baseLine;
		}
		public void setBaseLine(double baseLine) {
			this.baseLine = baseLine;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public void inputConsole(){
			Scanner scan = new Scanner(System.in);
			System.out.print("�� �غ�(cm) : ");
			setBaseLine(scan.nextDouble());
			System.out.print("�� ����(cm) : ");
			setHeight(scan.nextDouble());
		}
		public double calcArea(){
			double area = ( getBaseLine() * getHeight() ) /2 ; 
			return area;
		}
		public void printResult(){
			System.out.printf("�� �ﰢ���� ������ %.2f �� �Դϴ�. ",calcArea());
		}
		public static void main(String[] args) {
			Triangle test = new Triangle();
			System.out.println(test);
		}
		@Override
		public String toString() {
			return "Triangle [baseLine=" + baseLine + ", height=" + height
					+ "]";
		}
}

