package java0203.ftp;

import java.io.*;
import java.net.*;

public class ServerEx01 {
	public static void main(String[] args) throws Exception{
		ServerSocket ss= new ServerSocket(7777); // ��Ʈ��ȣ�� ServerSocket��ü ��
		while(true){
			Socket s= ss.accept(); // Ŭ���̾�Ʈ ��û�� ��ٷ� Socket ��ü�� ��
			BufferedInputStream bufin = new BufferedInputStream(new FileInputStream
		    ("C:\\Users\\Koo\\Videos\\Frozen 2013 DVDScr XViD AC3-FiNGERBLaST\\Frozen 2013 DVDScr XViD.avi"));
			BufferedOutputStream bufout = new BufferedOutputStream(s.getOutputStream());
			byte arr[] = new byte[1024];
			int num=0;
			while((num = bufin.read(arr))!= -1 ){
					bufin.read(arr,0,num);	
					bufout.write(arr,0,num);
					System.out.println(num+"Byte");
			}
			s.close();
			bufin.close();
			bufout.close();
		}
	}
}
