package java0114;
import java.util.Scanner;

public class Motor {
	private String company;
	private String carName;
	private String size;
	private String type;
	private int speed;
	private double fuelEfficiency;
	
	public Motor(){
		
	}
	public Motor(String company, String carName, String size, String type,
			int speed, double fuelEfficiency) {
		super();
		this.company = company;
		this.carName = carName;
		this.size = size;
		this.type = type;
		this.speed = speed;
		this.fuelEfficiency = fuelEfficiency;
	}

	public String getCompany() {
		return company;
	}
	public String getCarName() {
		return carName;
	}
	public String getSize() {
		return size;
	}
	public String getType() {
		return type;
	}
	public int getSpeed() {
		return speed;
	}
	public double getFuelEfficiency() {
		return fuelEfficiency;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	public void startUp(){
		System.out.println(getCarName()+"�� �õ��� �̴ϴ�.");
	}
	public void turnOff(){
		System.out.println(getCarName()+"�� �õ��� ��ϴ�.");
	}
	public void showSpec(){
		System.out.println("������ ������ "+getCompany()+"�� "+getCarName()+"�Դϴ�.");
		System.out.println("�� ������ "+getSize()+"�̸鼭 "+getType()+"�Դϴ�.");
		System.out.println("���� ������ �ӵ��� "+getSpeed()+"(km/h)�̰� �����"+getFuelEfficiency()+"(km/l)�Դϴ�."  );
	}
	public void gearUp(){
		if(speed>1)
			speed += 10;
		if(speed == 300)
			speed -= 50;
		System.out.println("���ӵ� "+getCarName()+"�� �ӵ��� "+getSpeed()+"(km/h)�Դϴ�.");
	}
	public void fillup(){
		fuelEfficiency *= 100;
		System.out.println("���� ������ 100L�� ������ ��� "+fuelEfficiency+"(km)�� ������ �� �ֽ��ϴ�. ");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("[ �ڵ��� �� ] ");
		int exit;
		
		while(true){
			Motor motor = new Motor();
			System.out.println("==============================");
			System.out.print("�ڵ��� ȸ�� : ");
			motor.company = scan.next();
			System.out.print("�ڵ��� �̸� : ");
			motor.carName = scan.next();
			System.out.print("�ڵ��� ũ��(����/������/����/����) : ");
			motor.size = scan.next();
			System.out.print("�ڵ��� ���� : ");
			motor.type = scan.next();
			System.out.print("�ӷ� : ");
			motor.speed = scan.nextInt();
			System.out.print("���� : ");
			motor.fuelEfficiency = scan.nextDouble();
			motor.showSpec();
			motor.gearUp();
			motor.fillup();
			System.out.print("���Ῡ��[����� 0, ����� 1] : ");
			exit = scan.nextInt();
			if(exit == 0)
				break;
		}
		
	}
	@Override
	public String toString() {
		return "Motor [company=" + company + ", carName=" + carName + ", size="
				+ size + ", type=" + type + ", speed=" + speed
				+ ", fuelEfficiency=" + fuelEfficiency + "]";
	}
}