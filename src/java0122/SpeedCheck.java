package java0122;

public class SpeedCheck {

	public static void main(String[] args) {
		
		String str = "A";
		String target = "B";
		
		//������ ������ ����ð�
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++)
			str = str+target;
		long end = System.currentTimeMillis();
		
		System.out.println("Sting ó��"+(end-start));
		
	}

}
