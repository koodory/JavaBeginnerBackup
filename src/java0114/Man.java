package java0114;

public class Man {
// ��� �ʵ� (����) : member field
	private String name, skinColor, gender;
	private double weight, height;

// ���� ����(source-> constructor using field..)
public Man() {
	// �⺻���� ȣ��, �ʱ�ȭ ����
}
public Man(String name, String skinColor, String gender, double weight,
			double height) {
		this.name = name;
		this.skinColor = skinColor;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	} // �ʱ�ȭ ����

// ����ʵ忡 ���� �����ϴ� �޼ҵ�� (source-> Getter&Setter -> Select setter)
	public void setName(String name) {
		this.name = name; // ���������� ����ʵ� ����
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

//��� �ʵ忡 ���� ��ȯ�޴� �޼ҵ��	(source-> Getter&Setter -> Select getter)
	public String getName() {
		return name;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public String getGender() {
		return gender;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public void running( ){
		System.out.println("��(��) �ڴ�.");
	}
	
// ��� �޼ҵ�:  member method, heap ������ ����	
	public void walk( ){
		System.out.println("��(��) �ȴ´�."); //name�� ����(�Ű�)����
	}
	
	public void seat( ){
		System.out.println("��(��) �ɴ´�.");
	}
	
	public void sleep( ){
		System.out.println("��(��) �ܴ�.");
	}
	
	public void wakeUp( ){
		System.out.println("��(��) �Ͼ��."); //name�� ���
	}
	
	public static void main(String[] args) {
		Man sally = new Man();
		sally.setName("��");
		sally.setGender("����");
		sally.setSkinColor("����");
		sally.setHeight(170);
		
		System.out.print(sally.getName()+"��� "+sally.getSkinColor()+sally.getGender());
		sally.walk();
		System.out.println(sally); //toStirng()�� ȣ������ �ʾƵ� �Ӽ��� �� ������
		
		Man kevin = new Man();
		kevin.setName("ĳ��");
		kevin.setGender("����");
		kevin.setSkinColor("����");
		kevin.setHeight(190);
		System.out.println("���� �̸��� "+kevin.getName()+"�Դϴ�.");
		System.out.print(kevin.getName());
		kevin.sleep();
		
		Man sanghyun = new Man("������","Ȳ��","����",70,169);
		System.out.print(sanghyun.getName()+"�� ");
		sanghyun.wakeUp();
	}
	@Override
	public String toString() {
		return "Man [name=" + name + ", skinColor=" + skinColor + ", gender="
				+ gender + ", weight=" + weight + ", height=" + height + "]";
	} //����ʵ��� �ʱ�ȭ �� Ȯ��(source->toString-->Generate Method comment)
}
