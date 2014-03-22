package java0121.apple.subemp;

import java.text.DecimalFormat;
import java0121.apple.emp.Employee;

public class RegularEmployee extends Employee {

	private int bonus;
	
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public double getMonthPay() {
		return pay/(double)12+bonus/(double)12;
	}
	
}
