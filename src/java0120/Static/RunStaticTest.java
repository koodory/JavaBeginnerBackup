package java0120.Static;
public class RunStaticTest {

	public static void main(String[] args) {
		System.out.println(StaticTest.MODEL_NUM);
		StaticTest st=new StaticTest();
		System.out.println(st.size);
		StaticTest.sTest();
		st.nTest();
	}

}
