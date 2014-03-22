package java0115;
import java.util.Scanner;

public class Circle {
	private double radius;

	public Circle(){
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void inputConsole(){
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ������ �Է�(cm) : ");
		setRadius(scan.nextDouble());
	}
	public double calcArea(){
		double area = Math.PI * Math.pow(getRadius(), 2);
		return area;
	}
	public void printResult(){
		System.out.printf("�� ���� ������ %.2f �� �Դϴ�. ",calcArea());
	}
	public static void main(String[] args) {
		Circle test = new Circle();
		System.out.println(test);
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
