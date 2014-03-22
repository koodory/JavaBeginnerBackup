package java0109;

public class TestOperand {
	public static void main(String[] args){
		byte op1 = -128;
		byte op2 = 7;
		
		int r=op1 | op2;
		r=~op1;
		System.out.println(r);
		int result = op1>>1;
		System.out.println(result);
		int result2= op1>>>1;
		System.out.println(result2);	
	}

}
