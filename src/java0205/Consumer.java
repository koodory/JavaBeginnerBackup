package java0205;
import java.util.*;

public class Consumer extends Thread {	
	Buffer dataBuffer;
	public Consumer(Buffer b){
		dataBuffer=b;
	}
	public void run(){
		Random r = new Random();
		for(int i = 0; i<10 ; i++){
			int num = dataBuffer.get();
			System.out.println("�Һ���:"+ num);
			try{
				sleep(Math.abs(r.nextInt()%100));
			}catch(InterruptedException e){}
		}
	}
}

