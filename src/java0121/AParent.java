package java0121;

public abstract class AParent {
	private int age;
	private String name;
	private String gender;
	private String address;
	
	public abstract void study(int time);
	public abstract void takeCareSibling();
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void eat(String food){
		System.out.println(food+"��(��) �Դ´�.");
	}
	
	public void sleep(int time){
		System.out.println(time+"��(��) �ܴ�.");
	}
	
	public void walk(String direct){
		System.out.println(direct+"���� �ȴ´�.");
	}

	@Override
	public String toString() {
		return "AParent [age=" + age + ", name=" + name + ", gender=" + gender
				+ ", address=" + address + "]";
	}
}
