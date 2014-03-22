package java0204;

public class ThreadEx1 {
	public static void main(String[] args) {
		MyThread01 my1, my2;
		my1 = new MyThread01("ù ��° ������"); //���� ��
		my2 = new MyThread01("�� ��° ������");
		my1.start(); // ������ ����
		my2.start();
		}
}

