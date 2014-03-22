package java0127;
import java.io.*;

public class InStrRd {
public static void main(String[] args){
	InputStreamReader in = new InputStreamReader(System.in);
	try{
		while(true){
			int i = in.read();
			char myChar = (char)i;
			System.out.print(myChar);
		}
	}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
	}
}
