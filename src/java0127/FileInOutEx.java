package java0127;
import java.io.*;

public class FileInOutEx {

	public static void main(String[] args) {
		try{
			FileOutputStream out = new FileOutputStream("test.txt");
			for(byte i = 0 ; i< 10 ; i++)
				out.write(i+'A');
			System.out.println("Data was saved!");
			out.close();
		}catch(IOException e){
			System.out.println("ERROR!");
		}
		try{
			FileInputStream file = new FileInputStream("test.txt");
			InputStreamReader in = new InputStreamReader(file);
			int fp;
			while((fp = in.read())!= -1){ // -1 = EOF
				System.out.print((char)fp+" ");
			}
			in.close();
		}catch(IOException e){
			System.out.println("������ �аų� ���� ����ϴ�");
		}
	}
}
