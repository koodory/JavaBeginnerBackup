package java0127;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTest {
	public static void main(String[] args){
		BufferedReader bufR=new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true){
				System.out.print("Input String : ");
				String msg = bufR.readLine();
				msg = msg.toLowerCase();
				if(msg.equals("exit")){
					System.out.println("Terminate this program");
					break;
				}else{
					System.out.println("["+msg+"]\n");	
				}
			}
			bufR.close(); // IO Stream close
		}catch (IOException e) {
			e.printStackTrace();
		}//�ٴ��� ����
		
	}
}
