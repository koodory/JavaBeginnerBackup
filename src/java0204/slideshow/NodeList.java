package java0204.slideshow;

public class NodeList {
	Node pointer;
	NodeList(){
		pointer = null;
	}
	public void insertNode(String nodeValue){
		Node newNode = new Node(nodeValue);
		if(pointer == null){
			newNode.next = newNode;
			newNode.prev = newNode;
		}
		else if(pointer.next == null && pointer.prev == null && pointer != null){
			newNode.next = pointer;
			newNode.prev = pointer;
			pointer.prev = newNode;
			pointer.next = newNode;
		}
		else if(pointer!=null){
			newNode.next = pointer.next;
			newNode.prev = pointer;
			pointer.next.prev  = newNode;
			pointer.next = newNode;
		} 
		pointer = newNode;
		System.out.println("Successfully inserted:"+pointer.getValue());
	}
}
