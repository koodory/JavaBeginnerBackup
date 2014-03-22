package java0118.a;
//import b.B; // b�� public�����ڰ� �־�� ����

public class A {
	public int num1=10;
	int num2 = 20;
	private int num3=30;
	protected int num4 = 40;
	public A(){
	}
	void aTest(){
		//B b=new B(;) // b�� public�����ڰ� �־�� ����
		AA aa = new AA();
		System.out.println(num3);
	}
}

