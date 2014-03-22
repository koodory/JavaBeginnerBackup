package java0127;
import java.io.*;
public class FileCopyEx {

	public static void main(String[] args) {
		try{
			FileReader in =new FileReader("c:///temp/data1.txt");
			FileWriter out = new FileWriter("c:///temp/data2.txt");
			int fp;
			while((fp=in.read())!=-1)
				out.write(fp);
			in.close();
			out.close();
		}catch(IOException e){
			
		}

	}

}
