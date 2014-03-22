package java0123.loto;

import java.util.Random;

public class LottoEx01 {
	public static void main(String[] args){
		Random ran = new Random();
		String LottoStr = "";
		int[] num = new int[7];
		System.out.println(" [ Lotto Program ]\n ");
		for(int i=0;i<7;i++){
				num[i] = ran.nextInt(48)+1;
				if(i > 1)
				{
					for(int j=0;j<i ; j++){
						if(num[i] == num[j])
							i--;
						}
				} 
		}
		for(int i=0; i<7; i++){
			System.out.printf("%d ",num[i]);
		}
	}				
}

