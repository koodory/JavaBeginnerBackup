package ChattingServer;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientExample {
	public static void main(String[] args){
		Socket socket = null;
		try{
			socket = new Socket("192.168.0.5", 9000);
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			Scanner scan = new Scanner(System.in);
			System.out.print("Input String to transfer : ");
			String str = scan.nextLine();
			out.write(str.getBytes());
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			try{
				socket.close();
			}
			catch(Exception e){
				
			}
		}
	}
}
