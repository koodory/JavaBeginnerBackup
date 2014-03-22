package java0203.ftpupload;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx02 {
	static String address, clientAdd;
	
	public static void IPList() throws UnknownHostException{
		InetAddress Address = InetAddress.getLocalHost(); // IP �ּ����� ȹ�� 
		LinkedList <String> list= new LinkedList <String>();
		list.add(Address.getHostAddress());
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			address = iterator.next();
		}
	}
	
	public static void main(String[] args) throws Exception{
		
		ClientEx02 IPList = new ClientEx02();
		while(IPList.address != null){
			String clientAdd = IPList.address;
		}
		Socket s = new Socket(clientAdd,7777);
		BufferedInputStream bufin = new BufferedInputStream(new FileInputStream
				("d:\\a.txt"));
		BufferedOutputStream bufout = new BufferedOutputStream(s.getOutputStream());
		byte arr[]= new byte[1024];
		int length = 0;
		while((length = bufin.read(arr))!=-1){
			bufin.read(arr,0,length);
			bufout.write(arr,0,length);
			System.out.println(length+"Byte");
		}
		s.close();
		bufin.close();
		bufout.close();
	}
}
