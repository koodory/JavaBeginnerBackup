package java0114;
import java.util.Scanner;


public class RunMakeTv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("[ TV Generation ]");
		String productName, modelNumber;
		int size, channel, volume;
		int exit;
		Tv tv;
		while(true){
			System.out.println("--------------------------------");
			System.out.print("Product Name : ");
			productName = scan.nextLine();
			System.out.print("Model Number : ");
			modelNumber = scan.nextLine();
			System.out.print("Screen Size : ");
			size = scan.nextInt();
			System.out.print("Channel : ");
			channel = scan.nextInt();
			System.out.print("Volume : ");
			volume = scan.nextInt();
			tv = new Tv(productName,modelNumber,size,channel,volume);
			System.out.println("Product Name is "+productName);
			System.out.println("Model Number is "+modelNumber);
			System.out.println("Screen is "+size+"inch wide");
			tv.onPower();
			tv.upChannel();
			tv.upVolume();
			System.out.println("���Ῡ��[����� 0, ����� 1]");
			
			exit=scan.nextInt();
			if(exit == 0)
				break;
		}
	}
}
