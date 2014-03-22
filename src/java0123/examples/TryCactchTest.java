package java0123.examples;

public class TryCactchTest {

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 0;
		int result1 =0;
		int result2 = 0;
		try{
			result1 = Integer.parseInt("�ΰ���");
			result2 = num1/num2;
//		}catch(NumberFormatException e){
//			System.out.println("��������� ���� �ʽ��ϴ�.");
//			System.out.println("�������·� �Է� �ٶ�ϴ�.");
//			result1= Integer.parseInt("150");
		}
		catch(Exception e){ //��� ������ ������� ���� �� ����
			System.out.println("��������� ���� �ʽ��ϴ�.");
			System.out.println("�������·� �Է� �ٶ�ϴ�.");
			result1= Integer.parseInt("150");
		}	
		finally{
			try{
				result2 = num1/num2;
			}catch(ArithmeticException e){
				System.out.println("�������� 0���� ������ �ȵ˴ϴ�.\n������ ���� 5�� �����մϴ�!");
				num2 = 5;
			}
			
		}
		System.out.println("���1: "+result1);
		System.out.println("���2: "+result2);
	}
}
