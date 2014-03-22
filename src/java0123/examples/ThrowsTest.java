package java0123.examples;

public class ThrowsTest {
	int[] arr={1,2,3};
	
	public void test1() throws ArrayIndexOutOfBoundsException{
		System.out.println(arr[4]);
	}
	public void test2(){
		try{
			test1();
		}catch(ArrayIndexOutOfBoundsException e){ //catch�� ����Ŭ������ �޾Ƽ� ��� ó��
			System.out.println("�迭�� �ε��� ������ ������ϴ�.");
		}
	}
	public static void main(String[] args){
		ThrowsTest tt = new ThrowsTest();
		tt.test2();
	}
}
