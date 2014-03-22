package java0110;
import java.util.Calendar;

public class GetDate {

	public static void main(String[] args) {
		System.out.println("[ ���� ���߱� ]\n");
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.DAY_OF_WEEK);

		switch(date){
		case 1:
			System.out.println("���� ������ �Ͽ���");
			break;
		case 2:
			System.out.println("���� ������ �����");
			break;
		case 3:
			System.out.println("���� ������ ȭ����");
			break;
		case 4:
			System.out.println("���� ������ ������");
			break;
		case 5:
			System.out.println("���� ������ �����");
			break;
		case 6:
			System.out.println("���� ������ �ݿ���");
			break;
		case 7:
			System.out.println("���� ������ �����");
			break;
		}
	}
}
