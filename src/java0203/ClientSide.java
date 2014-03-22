package java0203;
import java.io.*;
import java.net.*;

public class ClientSide {

	public static void main(String args[]) throws Exception{

		Socket c = new Socket("192.168.0.46",7777); //������ �ּҿ� ��Ʈ��ȣ�� ���� ��ü ��
		InputStream is = c.getInputStream(); 
		DataInputStream dis = new DataInputStream(is); //������ �Է¹ޱ� ���� ��Ʈ�� ��ü
		for(int i=1;i<=6;i++){
			int j=dis.readInt(); // ������ ����
			System.out.println("�������� ���� ������ " + j + " ���");
		}
		c.close();
	}

}
