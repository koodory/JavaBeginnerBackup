package java0122;
import java.util.Calendar;

public class CalcSystemDate {
	public static void main(String[] args) {
	Calendar dateCal = Calendar.getInstance();
	int year = dateCal.get(Calendar.YEAR);
	int month = dateCal.get(Calendar.MONTH)+1;
	int date = dateCal.get(Calendar.DATE);
	int day = dateCal.get(Calendar.DAY_OF_WEEK);
	System.out.print(year+"�� "+month+"�� "+date+"�� ");
	String dayStr="";//�ʱ�ȭ
	
	switch(day){
	case 1:  dayStr="��"; break;
	case 2:  dayStr="��"; break;
	case 3:  dayStr="ȭ"; break;	
	case 4:  dayStr="��"; break;	
	case 5:  dayStr="��"; break;	
	case 6:  dayStr="��"; break;	
	case 7:  dayStr="��"; break;	
	}
	System.out.println(dayStr+"����");
	}
}
