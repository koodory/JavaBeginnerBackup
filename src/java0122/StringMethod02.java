package java0122;

public class StringMethod02 {

	public static void main(String[] args) {
		String flowers ="���:��ȭ:����:��������:�عٶ��";
		String[] splitFlower= flowers.split(":");
		System.out.println(splitFlower[3]);
		
		System.out.println(flowers);
		System.out.println(flowers.replace(':',','));
		System.out.println(flowers); // String�� ���� �ѹ� �ԷµǸ� ������� ����
		flowers=flowers.concat(":������"); //���� flower�� �����ǰ� concató���� ���ο� ��ä ��
		System.out.println(flowers);
	}
}