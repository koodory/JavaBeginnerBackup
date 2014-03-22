package java0120.Static;


public class Child extends Parent {
	public Child() {
//		System.out.println(money);
//		super("���?","����");
//
//		System.out.println(getCar());
//		System.out.println(getHouse());
//		sleep();
//		System.out.print("�츮 �θ���� ");
//		super.sleep();
//		eat();
	}
	
	@Override
	public void sleep() {
		System.out.println("8�ð� �ܴ�.");
	}
	
	public void study(){
		System.out.println("������ ����Ѵ�.");
	}

	public static void main(String[] args) {
		Child ch=new Child();
		Parent p=new Child();
		ch.sleep();
		ch.eat();
		p.sleep();
		p.eat();
//		p.study();
	}
	
}




