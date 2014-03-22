package java0122;

public class SpeedCheck2 {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("A");
		String target = "B";
		
		//������ ������ ����ð�
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++)
			str = str.append(target);
		long end = System.currentTimeMillis();
		
		System.out.println("StingBuilder ó��"+(end-start));
		
	}

}
