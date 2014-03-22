package java0115;
import java.util.Scanner;

public class RunMakeBMI {

	public static void main(String[] args){
	int exit;
		while(true){
			BMI data = new BMI();
			data.printInput();
			data.printBMIResult();
			Scanner scan = new Scanner(System.in);
			System.out.print("\n���� (0) : ");
			exit = scan.nextInt();
			if(exit == 0)
				break;
		}
	}
}
