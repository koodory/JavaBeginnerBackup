package java0121.apple.subemp;

import java.text.DecimalFormat;

public class ControllerEmployee {

	public static void main(String[] args) {
		RegularEmployee remp1=new RegularEmployee("bit001","kathy",36000000, 1000000);
		System.out.println(remp1);
		DecimalFormat dFormat=new DecimalFormat("#,###");
		System.out.println(remp1.getName()+"(��)�� ���� �޿��� "+dFormat.format(remp1.getMonthPay())+"��");
		PartTimeEmployee remp2 = new PartTimeEmployee("bit002","Sang-Hyun",50000,30);
		System.out.println(remp2.getName()+"(��)�� ���� �޿��� "+dFormat.format(remp2.getMonthPay())+"��");
		TempEmployee remp3 = new TempEmployee("bit003","Ji-Sun",24000000,5);
		System.out.println(remp3.getName()+"(��)�� ���� �޿��� "+dFormat.format(remp3.getMonthPay())+"��");
		//protect ����̹Ƿ� �ڽ��� �ٷ� ������ �� �� Get�޼ҵ带 �����
	}
}
