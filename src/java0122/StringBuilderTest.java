package java0122;

public class StringBuilderTest {
	public static void main(String[] args){
		StringBuilder str=new StringBuilder("bit computer");
		System.out.println(str.reverse());
		System.out.println(str.insert(0,"!"));
		System.out.println(str.reverse());
	}
}
