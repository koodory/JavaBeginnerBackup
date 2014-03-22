package java0127;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class OutStrWrEx {

	public static void main(String[] args) {
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		try{
			out.write("�ڹ� ���α׷���");
			out.flush();
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}
}
