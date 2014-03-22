package java0113;

public class DynamicArray {

	public static void main(String[] args) {
		int[ ][ ] arr2 = new int[ 5 ][ ];
		int number = 1;
		for( int i = 0 ; i < arr2.length ; i++){
			arr2[ i ] = new int [ i+1 ] ;
			for( int j = 0 ; j < arr2[ i ].length ; j++){
				arr2[ i ][ j ] = number;
				number++;
				System.out.print(arr2[ i ][ j ] + "\t");
			}
			System.out.println( );
		}
	}
}
