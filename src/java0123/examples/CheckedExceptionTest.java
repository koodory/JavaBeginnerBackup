package java0123.examples;

import java.io.IOException;

public class CheckedExceptionTest {
	
	public void test1() throws IOException{
		System.out.println("�Է� : ");
		int input=System.in.read(); //�� ���� ������ �Է¹���
		System.out.println("��� : "+input);
	}
	public static void main(String[] args) throws IOException {
		CheckedExceptionTest cet = new CheckedExceptionTest();
		cet.test1();
	}

}
