package java0205;

public class MyThread2 extends Thread{
	public MyThread2(String name){
		super(name);
	}
	public void run()
	{
		try{
			for(int n=0;n<10;n++)
			{
				sleep(1);
				System.out.println(this.getName()+": "+n);
			}
		}catch(InterruptedException ie){
			return;
		}
	}
}
