package java0121.apple.subemp;

import java0121.apple.emp.Employee;

public class TempEmployee extends Employee {

	private int hireYear;
	public TempEmployee(String empno, String name, int pay, int hireYear){
		super(empno,name,pay);
		this.hireYear = hireYear;
	} 
	public String getName(){
		return name;
	}
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return pay/(double)12;
	}

}
