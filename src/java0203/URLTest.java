package java0203;
import java.net.*;
public class URLTest {
	public static void main(String[] args) throws MalformedURLException{
		URL naver = new URL
				("http://www.naver.com/index.html");
		System.out.println("Protocol : "+naver.getProtocol()); // ��������
		System.out.println("Port : "+naver.getPort());// web���� �⺻ ��Ʈ ���(�⺻��Ʈ�� return���� -1)
		System.out.println("Host : "+naver.getHost()); //ȣ��Ʈ��
		System.out.println("File : "+naver.getFile()); // ��� + ���ϸ�
		System.out.println("��ü URL : "+naver.toExternalForm()); // ��ü URL
	}
}
