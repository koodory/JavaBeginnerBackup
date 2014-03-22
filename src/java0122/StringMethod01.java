package java0122;
import java.util.Arrays;


public class StringMethod01 {
	public static void main(String[] args){
		String name="ABC";
		char[] chNames=name.toCharArray();//���ڿ� �������� ���ڿ� �迭�� ���� ���� �޼ҵ�
//		for(int i=0;i<chNames.length; i++){
//			System.out.println(chNames[i]);	
//		}
		System.out.println(Arrays.toString(chNames)); //�迭�� ��� ���� ���ڷ� ��ȯ�Ͽ� ���
		// [ str1, str2... str(n)]�� ������� ���
		
		byte[] bNames=name.getBytes(); //���ڰ��� ascii���� ����, ������ ���ڴ� sign bit������ ���� ��µ� �� ����
		System.out.println(Arrays.toString(bNames));
		
		char ch=name.charAt(1); //���ڿ� index�� ���ڸ� return;
		System.out.println(ch);
		
		char[] chs={'p','e','a','c','e'};
		String chsStr=new String(chs);
		System.out.println(chsStr);
		System.out.println(chsStr.substring(2, 4));//endIndex�� ���ϴ� �迭 +1, �� ������ Null���� ī��Ʈ
		System.out.println(chsStr.substring(2));//beginIndex ���� ������ ���
		System.out.println(chsStr); 
		// ��Ʈ�� Ŭ������ ���ϰ��� ������ �޸𸮿� �Ҵ�
		// �޼ҵ带 ȣ���Ҽ��� �޸𸮸� ���� �����
		
	}
}
