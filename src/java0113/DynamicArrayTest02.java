package java0113;

public class DynamicArrayTest02 {
	public static void main(String[] args){
		int [][] arr2 = new int[7][];
		int number =10;
		
		for(int i = 0 ; i < arr2. length; i++){
			
			if(i <= 3)
			{
				arr2[i] = new int[5-i];
				for(int j = 0; j < arr2[i].length; j++){
					arr2[i][j] = number;
					number += 10;
					System.out.print( arr2[i][j]+ "\t");
				}
			}
			else{
				arr2[i] = new int[i-1];
				for(int j = 0; j < arr2[i].length; j++){
					if( i == 4 && j == 0)
						number -= 20;
					arr2[i][j] = number;
					number -= 10;
					System.out.print( arr2[i][j]+ "\t");
				}
			}
			System.out.println();
		}
	}
}
