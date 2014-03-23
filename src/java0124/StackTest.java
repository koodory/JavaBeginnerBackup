package java0124;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args){
		Stack stack = new Stack();
		stack.push("�ΰ���");
		stack.push(100); //generic ��ɿ� ���ؼ� �⺻�ڷ��� ��� ����
		stack.push(true);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
