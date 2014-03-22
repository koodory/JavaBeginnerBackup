package java0115;
import java.util.Scanner;

public class BMI {
	private double height, weight;

	public BMI(){
	}
	public BMI(double height, double weight, double bmi) {
		super();
		this.height = height;
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void printInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" [ BMI ��� ���α׷� ]\n");
		System.out.println("**** �Է� ****\n");
		System.out.print("ü��(kg) : ");
		setWeight(scan.nextDouble());
		System.out.print("Ű(cm) : ");
		setHeight(scan.nextDouble());
	}
	public double calcBMI(){
		double bmi = getWeight()/Math.pow(getHeight()/100, 2);
		return bmi;
	}
	public void printBMIResult(){
		System.out.println("\n**** ��� ****\n");
		String result = null;
		if(calcBMI()<18.5)
			result = "��ü��";
		else if(calcBMI()<23)
			result = "����ü��";
		else if(calcBMI()<25)
			result = "��ü��";
		else if(calcBMI()<30)
			result = "��";
		else if(calcBMI()<30)
			result = "�?��";
		System.out.printf("����� BMI�� %.2f���� ���� %s�Դϴ�.",calcBMI(),result);
	}
	public static void main(String[] args) {
		BMI init = new BMI();
		System.out.println(init);
	}
	@Override
	public String toString() {
		return "BMI [height=" + height + ", weight=" + weight + "]";
	}
}
