package java0121.test;

public class IPhone implements Phone {

	@Override
	public void listenMP3() {
		System.out.println("mp3���");
	}

	@Override
	public void takePicture() {
		System.out.println("�������");	
	}

	@Override
	public void recordMovie() {
		System.out.println("�������ȭ");
	}

	@Override
	public void callNum() {
		System.out.println("��ȭ�ɱ�");		
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�ޱ�");		
	}
	
	public void installApp(){
		System.out.println("���� �ν����Ѵ�.");
	}
}
