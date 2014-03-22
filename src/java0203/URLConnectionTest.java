package java0203;
import java.net.*;
import java.io.*;
public class URLConnectionTest {

	public static void main(String[] args)throws Exception {
		URL naver = new URL
		("http://www.naver.com/index.html");
		URLConnection naverCon = naver.openConnection(); // URL ��ü�� �̿��Ͽ� URLConnetction ��ü ��
		System.out.println("������ Ÿ�� : "+naverCon.getContentType());
		System.out.println("=== ������ ���� ===");
		InputStream in = naverCon.getInputStream();
		BufferedReader input = new BufferedReader(new InputStreamReader(in,"utf-8"));
		FileWriter writer =  new FileWriter("d:\\test.txt"); 
		int fp;
		while((fp = input.read())!= -1){
			System.out.print((char)fp);
			writer.write((char)fp+"");
		}
		input.close();
		writer.close();
	}
}
