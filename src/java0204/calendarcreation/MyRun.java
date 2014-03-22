package java0204.calendarcreation;
import java.awt.*;
import javax.swing.*;
import java.util.Calendar;

class MyRun implements Runnable {
	JLabel Lb1, Lb2; //String�� ����� ���ڿ� Objects 2�� ����
	public MyRun(JLabel Lb1, JLabel Lb2){
		this.Lb1 = Lb1;
		this.Lb2 = Lb2;
	}
	@Override
	public void run(){
		while(true){
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		int am_pm = calendar.get(Calendar.AM_PM);
		String am_pm_str;
		if(am_pm == calendar.AM)
			am_pm_str="����";
		else
			am_pm_str = "����";
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		
		Lb1.setText(year+"�� "+month+"�� "+date+"��");
		Lb2.setText(am_pm_str+" " +hour+"�� "+min+"�� "+sec+"��");
		try { //Sleep�� �׻� ����ó��
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
