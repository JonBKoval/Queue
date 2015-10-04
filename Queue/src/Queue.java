
public class Queue<V> {
	private Node<V> front = null;
	private Node<V> back = null;
	
	public Queue() {
		front = null;
		back = null;
	}
	
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enqueue(Node<V> node) {
		if(isEmpty() == true) {
			front = new Node<V>();
			front.setNode(node.getNodeData());
			front.setNext(back);
			front.setLast(back);
			back = front;
			System.out.println(front.getNodeData());
		}
		else {
			Node<V> oldBack = back;
			back = new Node<V>();
			back.setNode(node.getNodeData());
			back.setNext(null);
			back.setLast(oldBack);
			oldBack.setNext(back);
			System.out.println(back.getNodeData());
		}
	}
	
	public Node<V> dequeue() {
		if(isEmpty() == true) {
			System.out.println("The queue is empty.");
			return null;
		}
		else {
			Node<V> returnNode = back;
			back = back.getPrev();
			return returnNode;
		}
	}
	
	public Node<V> getFront() {
		if(isEmpty() == true) {
			System.out.println("The queue is empty.");
			return null;
		}
		return front;
	}
}
