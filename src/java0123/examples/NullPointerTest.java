package java0123.examples;

import java.util.Random;

public class NullPointerTest {
	Random random; // Global variable, Heap memory�� �Ҵ�
	
	public void test1(){
	/*Random*/ random = new Random();//�������� random�� �Ҵ�, Stack�� �Ҵ�
	}
	public void test2(){
		int num=random.nextInt(10);
		System.out.println("����: "+num);
	}
	public static void main(String[] args){
		NullPointerTest npt = new NullPointerTest();
		npt.test1();
		npt.test2();
		
	}
}
