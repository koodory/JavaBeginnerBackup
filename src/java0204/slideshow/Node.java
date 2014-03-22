package java0204.slideshow;

public class Node {
	String value;
	Node next;
	Node prev;
	Node(String nodeValue){
		value = nodeValue;
		next = null;
		prev =null;
	}
	public String getValue() {
		return value;
	}
}
