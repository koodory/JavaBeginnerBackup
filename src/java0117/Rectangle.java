package java0117;
import java.util.Scanner;


public class Rectangle {
	private int w, h;

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double calcArea(){
		double area=getW()*getH();
		return area;
	}
	
	public void printResult(){
		System.out.printf("�� ���簢���� ������ %.2f ��" ,calcArea());
	}
	
	
}
