package java0203.ftp;
import java.io.*;
import java.net.*;

public class ClientEx01 {
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("192.168.0.3",7777);
		BufferedInputStream bufin = new BufferedInputStream(s.getInputStream());
		BufferedOutputStream bufout = new BufferedOutputStream(new FileOutputStream
				("c:\\movie.avi"));
		byte arr[]= new byte[1024];
		int length = 0;
		while((length = bufin.read(arr))!=-1){
			bufout.write(arr,0,length);
			System.out.println(length+"Byte");
		}
		s.close();
		bufin.close();
		bufout.close();
	}
}
