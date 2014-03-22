package java0118;

public class Child extends Parent{

	public Child() {
//		System.out.println(money);
//		super("���?","����"); //super class�� ��, �̸� ������� ���� default ��
//		System.out.println(getCar());
//		System.out.println(getHouse());
//		sleep();
//		System.out.println("�츮 �θ����");
//		super.sleep(); // �θ��� �޼ҵ� ȣ��
//		eat();
	}
	@Override //�θ�� �ڽ� ��� ���� �޼ҵ尡 �־�� override�� ��
	public void sleep(){
		System.out.println("8�ð��� �ܴ�."); //overriding �� child �޼ҵ�
	}
	public void study(){
		System.out.println("������ ����Ѵ�.");
	}
	
	//public void eat(){} //�θ��� Ŭ���� �޼ҵ尡 final�� �������� ����� ���� �Ұ�
	//this. super.�� main���� ����� �� ���
	public static void main(String[] args) {
		Child ch = new Child(); 
		Parent p = new Child(); //overriding �� ���� �켱 ����
		ch.sleep();
		ch.eat();
		p.sleep();
		p.eat();
//		p.study(); //Child��ü�� ������ �ȵǸ� overriding �� �͸� ����
	}

}
