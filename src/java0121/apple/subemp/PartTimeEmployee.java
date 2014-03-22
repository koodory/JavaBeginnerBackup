package java0121.apple.subemp;

import java0121.apple.emp.Employee;

public class PartTimeEmployee extends Employee {

	private int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		// TODO Auto-generated constructor stub
		this.workDay = workDay;
	}
	public String getName(){
		return name;
	}
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return pay*workDay;
	}

}
