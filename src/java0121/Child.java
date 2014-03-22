package java0121;

public class Child extends AParent {

	@Override
	public void study(int time) {
		System.out.println(time+"�ð� ����Ѵ�.");

	}

	@Override
	public void takeCareSibling() {
		System.out.println("������ �� �����ɴ�.");
	}
	
	public void play(){
		System.out.println("�ų��� ���.");
	}	
	
	@Override
	public void eat(String food) {
		System.out.println("�н�ƮǪ���� "+food+"��(��) �Դ´�.");
	}
}
