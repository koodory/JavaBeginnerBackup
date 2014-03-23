package java0124;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSet{
	public static void main(String[] args){
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Banana");
		queue.offer("Sandwich");
		queue.offer("Chicken");
		queue.offer("Apple");
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}
}
