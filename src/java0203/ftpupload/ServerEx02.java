package java0203.ftpupload;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx02 {
	static String address;
	
	public static void IPList() throws UnknownHostException{
		InetAddress Address = InetAddress.getLocalHost(); // IP �ּ����� ȹ�� 
		Address.getHostAddress(); // ���ڿ� ����
		LinkedList <String> list= new LinkedList <String>();
		list.add(InetAddress.getLocalHost().getHostAddress());
		list.add("192.168.0.3");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			address = iterator.next();
			System.out.println(address);
		}
	}
	public static void main(String[] args) throws Exception{
		ServerSocket ss= new ServerSocket(7777); // ��Ʈ��ȣ�� ServerSocket��ü ��
		ServerEx02 IPList = new ServerEx02();
		Socket s= ss.accept(); // Ŭ���̾�Ʈ ��û�� ��ٷ� Socket ��ü�� ��
		System.out.println("Client address : "+s.getInetAddress());
		IPList();
//		while(true){
			File file = new File("d:\\root");
			file.mkdir();
			BufferedInputStream bufin = new BufferedInputStream(s.getInputStream());
			BufferedOutputStream bufout = new BufferedOutputStream(new FileOutputStream("d:\\root\\temp.jpg"));
			byte arr[] = new byte[1024];
			int length=0, size = 0;
			while((length = bufin.read(arr))!= -1 ){
					bufout.write(arr,0,length);
					System.out.println(size+"Byte");
					size += length;
			}
			s.close();
			bufin.close();
			bufout.close();
//		}
	}
}
