package java0113;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[ ] arr = new int[10];
		for(int i = 0 ; i < arr.length ; i++){
			arr[ i ] = i+1;
		}
		
		//�Ųٷ� ���
		for(int i = arr.length-1 ; i>=0 ; i--){
			System.out.print(arr[ i ] + "\t");
		}
		
		//¦������ ���
		System.out.println( );
		for(int i = 0 ; i < arr.length ; i++ )
			if( arr[ i ] % 2 == 0)
				System.out.print(arr[ i ] + "\t");
		
		//Ȧ������ ���
		System.out.println( );
		for(int i = 0 ; i < arr.length ; i++ )
			if( arr[ i ] % 2 == 1)
				System.out.print(arr[ i ] + "\t");
		
		// enhance for��, �ٸ������ foreach�� ���� ���
		System.out.println( );
		for(int temp : arr){
			System.out.print( temp + "\t");
		}
	}
}
