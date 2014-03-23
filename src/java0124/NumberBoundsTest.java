package java0124;
import java.util.Scanner;

public class NumberBoundsTest{			
		public int ioTest(Scanner scan){
			System.out.print("�����Է� : ");
			return scan.nextInt();
		}
		// �������� throw�� ������ ���Ǹ����� ������ ������!
		public static void main(String[] args)/*throws UserException*/{
			Scanner scan = new Scanner(System.in);
			NumberBoundsTest nbt = new NumberBoundsTest();
			int number=nbt.ioTest(scan);
			
			try{
				if(number <1 || number > 10)
					throw new UserException("1~10������ �� �Է�");
			}catch(UserException e){
				System.out.println(e.toString());
				nbt.ioTest(scan);
			}
		}
}
