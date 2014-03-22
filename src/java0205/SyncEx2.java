package java0205;

public class SyncEx2 {

	public static void main(String[] args) {
		Buffer b = new Buffer();
		Producer p = new Producer(b);
		p.start();
		Consumer c = new Consumer(b);
		c.start();
	}
}

