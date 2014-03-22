package java0122;

public class StringTest {
	public static void main(String[] args){
//		String s1=String.valueOf(10);
//		String s2=String.valueOf(5.777);
//		String s3=String.valueOf(true);
//		String s4=String.valueOf('��');
		
		String s1=""+10;
		String s2=""+5.777;
		String s3=""+true;
		String s4=""+'A';
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		double result = Integer.parseInt(s1) + Double.parseDouble(s2);
		//�ڵ���ȯ
		System.out.println(result);
		
		String str1 ="�ΰ���";
		String str2 ="�ΰ���";
		
		System.out.println(str1==str2); //���ǹ��� ���� boolean������ ���
		
		String str3 = new String("�ΰ���");
		String str4 = new String("�ΰ���");
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4)); //���ǹ��� ���� boolean������ ���
		
	}
}
