package java0110;
import java.util.Random;

public class RandomEx {
	public static void main(String[] args){
		System.out.println("[ ���� �ڸ��� ���߱� ]\n");
		Random random = new Random( );
		int value = random.nextInt(1000 );
		
		if(value<10)
			System.out.println("��ſ��� �Ҵ�� ��ȣ("+value+")�� ���ڸ��� �Դϴ�");
		else if(value<100)
			System.out.println("��ſ��� �Ҵ�� ��ȣ("+value+")�� ���ڸ��� �Դϴ�");
		else if(value<1000)
			System.out.println("��ſ��� �Ҵ�� ��ȣ("+value+")�� ���ڸ��� �Դϴ�");
	}
}
