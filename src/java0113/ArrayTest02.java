package java0113;

public class ArrayTest02 {
	public static void main(String[] args){
		int[ ][ ]  arr2 = new int [ 3 ][ 4 ];
		int number = 1;
		for ( int i = 0 ; i < arr2.length ; i++){
			for( int j = 0 ; j < arr2[ i ].length; j++){
				arr2[ i ][ j ] =  number;
				number++;
			}
		}
		for ( int i = 0 ; i < arr2.length ; i++){
			for( int j = 0 ; j < arr2[ i ].length; j++){
				System.out.print(arr2[ i ][ j ]+"\t");
			}
			System.out.println( );
		}
	}
}
