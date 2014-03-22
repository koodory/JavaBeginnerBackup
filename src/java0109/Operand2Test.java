package java0109;

public class Operand2Test {
	public static void main(String[] args){
		byte i=10;
		byte j=10;
		int result = i++ + 7; //���� ������ ����
		int result2 = ++j + 7;
		System.out.println("result = "+result);
		System.out.println("result2 = "+result2);
		System.out.println("i = "+ i);
	}
}
