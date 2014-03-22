package java0203;
import java.net.*;

public class AddressTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress Address = InetAddress.getLocalHost(); //���� ��ǻ���� InetAddress ��ü ��
		System.out.println("���� ��ǻ�� �̸� : "+Address.getHostName()); //��ǻ�� ȣ��Ʈ ���� ����
		System.out.println("���� ��ǻ���� IP �ּ� : "+Address.getHostAddress()); // ��ǻ���� IP �ּ� ����
		Address = InetAddress.getByName("java.sun.com"); // ������ �̸����� InetAddress ��ü ��
		System.out.println("java.sun.com ��ǻ���� �̸��� IP �ּ� : "+Address);
		InetAddress all[] = InetAddress.getAllByName("www.daum.net");
		for(int i=0;i<all.length;i++) // www.daum.net ��ǻ�� �ּҸ� �迭�� ��
			System.out.println(all[i]);
	}

}
