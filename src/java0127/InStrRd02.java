package java0127;
import java.io.IOException;
import java.io.InputStreamReader;

public class InStrRd02 {

	public static void main(String[] args) {
//		InputStreamReader isr=new InputStreamReader(System.in);
//		char[] cbuf = new char[50]; // ĳ���� �迭, �ѱ��� ����� �ݵ�� �̹������
//		try{
//			isr.read(cbuf);
//			System.out.println(cbuf);
//		}catch(IOException e){
//			System.out.println(e);//����޼��� ���
//		}
		byte[] buf = new byte[50]; // 1Byte���� ó�� (�ѱ� �ȵ�)
		try{
			System.in.read(buf);
			System.out.println(new String (buf));
		    // ����Ʈ ��ü�� ��Ʈ�� ��ü�� �����ϸ� ���ڿ� ��� ����
			// ����� �ٷ� Garbage collector�� ��
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
