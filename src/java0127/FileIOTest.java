package java0127;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOTest {
	public static void main(String[] args){
		FileOutputStream fileOut;
		FileInputStream fileIn;
		InputStreamReader isr;
		try{
			fileOut = new FileOutputStream("test2.txt");
			for(int i=0; i<=10;i++)
				fileOut.write(i);
			fileIn = new FileInputStream("test2.txt");
			isr = new InputStreamReader(fileIn);
			int fp;
			while((fp=isr.read())!=-1)
				System.out.print(fp + " ");
			fileOut.close();
			fileIn.close();
		}catch(FileNotFoundException e){ // ������ ã�� ���Ҷ�
			e.printStackTrace();
		}catch(IOException e){ // ����� ����
			e.printStackTrace();
		}
	}
}
