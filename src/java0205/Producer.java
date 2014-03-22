package java0205;
import java.util.Random;

public class Producer extends Thread {
	Buffer dataBuffer;
	public Producer(Buffer b){
		dataBuffer=b;
	}
	public void run(){
		Random r = new Random();
		for(int i = 0; i<10 ; i++){
			dataBuffer.put(i);
			System.out.println("�����:"+ i);
			try{
				sleep(Math.abs(r.nextInt()%100));
			}catch(InterruptedException e){}
		}
	}
}

