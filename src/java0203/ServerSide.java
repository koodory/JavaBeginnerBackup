package java0203;

import java.io.*;
import java.net.*;

class ServerSide {
	public static void main(String[] args) throws Exception{
		ServerSocket ss= new ServerSocket(7777); // ��Ʈ��ȣ�� ServerSocket��ü ��
		while(true){
			Socket s= ss.accept(); // Ŭ���̾�Ʈ ��û�� ��ٷ� Socket ��ü�� ��
			OutputStream os =s.getOutputStream(); // byte ��Ʈ�� ��ü�� ���� ��ü�� ���� ��ü�� ��
			DataOutputStream dos = new DataOutputStream(os); // �⺻ �ڷ��� ������ ����� ���� ��ü ��
			for(int j=1; j<=10; j++){
				dos.writeInt(j); //���� ���
			}
			s.close();
		}
	}
}
