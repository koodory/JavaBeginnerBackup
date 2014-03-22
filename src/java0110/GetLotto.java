package java0110;
import java.util.Random;

public class GetLotto {
	public static void main(String[] args){
		System.out.println("[ �ζ� ��� ]\n");
		Random random = new Random( );
		
		for(int i = 0; i<5 ; i++){
			System.out.print(i+1+"ȸ ����\t");
			for(int j = 0; j<6; j++){
				int num = random.nextInt(45)+1;
				System.out.print(num+"\t");
			}
			System.out.println( );
		}
	}
}
