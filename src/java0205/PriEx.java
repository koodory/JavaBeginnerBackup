package java0205;

public class PriEx {

	public static void main(String[] args) {
		MyThread2 my1, my2;
		my1 = new MyThread2("�ִ� �켱 ���� ������");
		my1.setPriority(10);
		my2 = new MyThread2("�ּ� �켱 ���� ������");
		my2.setPriority(1);
		my1.start();
		my2.start();
	}
}
