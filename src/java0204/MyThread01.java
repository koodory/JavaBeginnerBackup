package java0204;

public class MyThread01 extends Thread{
	int n=0;
	public MyThread01(String name){
		super(name);
	}
	public void run()
	{
		while(true){
			System.out.println(this.getName()+">>"+n);
			n++;
			try{
				sleep(1000); //1000 msec�� ��
			}catch(InterruptedException ie){
				
			}
		}
	}
}

