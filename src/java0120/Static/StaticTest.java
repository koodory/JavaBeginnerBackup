package java0120.Static;

public class StaticTest {
	public static final String MODEL_NUM="LG2560BKOR";
	public int size;
	
	public static void sTest(){
		System.out.println("����� sTest() �޼ҵ�");
//		nTest();
	}
	
	public void nTest(){
		System.out.println("����� nTest() �޼ҵ�");
		sTest();
	}
	
	public static void main(String[] args) {
		System.out.println(MODEL_NUM);
		sTest();
//		System.out.println(size);
//		nTest();
	}

}
