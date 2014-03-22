package java0109;
import java.util.Calendar;
import java.util.Scanner;

public class GenderAge {
	public static void main(String[] args){
		System.out.print("���⵵ : ");
		Scanner scan = new Scanner(System.in);
		int birthYear =scan.nextInt();
		System.out.print("����(����:1, ����:2) : ");
		int gender = scan.nextInt();
		int age = Calendar.getInstance().get(Calendar.YEAR)-birthYear;
		// ��ǻ�Ϳ� ������ �⵵�� �����Ͽ� Ķ���� ��ü�� ����
		if(age < 14){
			if(gender == 1){
				System.out.print("����� ���� �̸鼭 �����Դϴ�. ");			
			}
			else{
				System.out.print("����� ���� �̸鼭 �����Դϴ�. ");	
			}	
		}
		else if(age <20){
			if(gender == 1){
				System.out.print("����� û�ҳ��̸鼭 �����Դϴ�. ");			
			}
			else{
				System.out.print("����� û�ҳ��̸鼭 �����Դϴ�. ");	
			}
		}
		else {
			if(gender == 1){
				System.out.print("����� �����̸鼭 �����Դϴ�. ");			
			}
			else{
				System.out.print("����� �����̸鼭 �����Դϴ�. ");	
			}
		}		
}
}
