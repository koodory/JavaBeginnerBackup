package java0118;

public class Parent {
	private int money;
	String car;
	String house;
	
	public Parent(){
		
	}
	
	public Parent(String car, String house) {
		super();
		this.car = car;
		this.house = house;
	}

	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public void sleep(){
		System.out.println("6�ð��� �ܴ�.");
	}
	public final void eat(){
		System.out.println("������� �Դ´�");
	}
}
