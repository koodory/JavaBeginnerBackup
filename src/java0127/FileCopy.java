package java0127;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("c:\\temp\\data1.txt"); // 
		// \(back slash)�� ������ \\�� ǥ��
		FileWriter writer = new FileWriter("c:///temp/data2.txt");
		// /(slash)�� ����� ��δ� / root�� //
		int fp;
		while((fp=reader.read())!=-1){
			writer.write(fp);
		}
		reader.close();
		writer.close();
	}
	

}
