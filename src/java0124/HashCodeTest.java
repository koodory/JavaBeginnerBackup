package java0124;
import java.util.Random;

public class HashCodeTest {

	public static void main(String[] args) {
		String s1 = new String("��"); //string�� ���������� ���� ���� ��� ��ü�� ���� ��� ���� �ּ� ����
		String s2 = new String("�ΰ�");
		String s3 = "��";
		String s4 = "��";
		
		System.out.println("String s1=new String(\"��\") : "+s1.hashCode());
		System.out.println("String s2=new String(\"��\") : "+s2.hashCode());
		System.out.println("String s3=\"��\") : "+s3.hashCode());
		System.out.println("String s4=\"��\") : "+s4.hashCode());
		
		Random r1= new Random();
		Random r2= new Random();
		System.out.println("Random r1=new Random() : "+r1.hashCode());
		System.out.println("Random r2=new Random() : "+r2.hashCode());
	}

}
