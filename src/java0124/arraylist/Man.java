package java0124.arraylist;

public class Man {
	String name, gender;
	int age;
	
	public Man(){
		
	}
	public Man(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void walk(){
		System.out.println(getName()+"(��)�� �ȴ´�.");
	}
	public void stop(){
		System.out.println(getName()+"(��)�� �����.");
	}
}
