package java0127;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImageCopyEx {
	public static void main(String[] args) throws IOException{
		BufferedInputStream infile = null;
		BufferedOutputStream outfile = null;
		try{
			infile = new BufferedInputStream(new FileInputStream("c:///Penguins.jpg"));
			outfile = new BufferedOutputStream(new FileOutputStream("d:///Penguins.jpg"));
			byte arr[]=new byte[1024]; //�����Ϸ��� ����Ʈ ���� ����
			while(true){
				int num = infile.read(arr);
				if(num <0) // ���۰� EOF�� ����, �� ���ۿ� ���ִ� byte�� ���� ��
					break;
				for(int i=0; i<num ;i++)
					outfile.write(arr[i]);
				}
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}finally{
				infile.close();
				outfile.close();
			}
	}
}


