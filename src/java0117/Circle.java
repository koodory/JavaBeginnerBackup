package java0117;
import java.util.Scanner;


public class Circle {
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
		
	public double calcArea(){
		double area=Math.PI*Math.pow(getR(),2);	
		return area;
	}
	
	public void printResult(){
		System.out.printf("�� ���� ������ %.2f ��" ,calcArea());
	}
	
}
