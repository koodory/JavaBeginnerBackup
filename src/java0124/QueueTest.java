package java0124;
import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		PriorityQueue<Object> queue = new PriorityQueue<Object>();
		queue.add("����"); // Priority Queue�� �⺻ Queue�� �������� ���ı���� ����
		queue.add("��Ʈ");
		queue.add("�޷�");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
