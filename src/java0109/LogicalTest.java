package java0109;

public class LogicalTest {
	
	public static void main(String[] args){
		//boolean op1 = 100>300;
		//boolean op2 = (100%4) == 0;
		// OR ������: op1 �Ǵ� op2�� true�̸� ������ true;
		boolean result = 100>300 || (100%4)==0;
		// ���� �����ڸ� �� ��� ��� ������ Ȯ���ؾ� �ϱ� ������ �ӵ��� ����
		// ���� �������� ��� Ư�� ������ �����ϸ� �ٷ� ��� ���⶧���� ���� ���� ��
		System.out.println(result);
		// AND ������: op10�� true�̰� op2�� true�̸� ������ true;
		result = 100>300 && (100%4)==0;
		System.out.println(result);
	}

}
