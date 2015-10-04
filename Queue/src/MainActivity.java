
public class MainActivity {

	public static void main(String[] args) {
		Node<Integer> tempNode = new Node<Integer>();
		Queue<Integer> queue = new Queue<Integer>();
		
		tempNode.setNode(15);
		queue.enqueue(tempNode);
		tempNode.setNode(16);
		queue.enqueue(tempNode);
		tempNode.setNode(17);
		queue.enqueue(tempNode);
		tempNode.setNode(18);
		queue.enqueue(tempNode);
		
		System.out.println("Dequeues:");
		tempNode = queue.dequeue();
		System.out.println(tempNode.getNodeData());
		System.out.println("Front = " + queue.getFront().getNodeData());
		
		tempNode = queue.dequeue();
		System.out.println(tempNode.getNodeData());
		System.out.println("Front = " + queue.getFront().getNodeData());
		
		tempNode = queue.dequeue();
		System.out.println(tempNode.getNodeData());
		System.out.println("Front = " + queue.getFront().getNodeData());
		
		tempNode = queue.dequeue();
		System.out.println(tempNode.getNodeData());
		System.out.println("Front = " + queue.getFront().getNodeData());

		
		//String Queue testing
		Queue<String> stringQueue = new Queue<String>();
		Node<String> tempStringNode = new Node<String>();
		
		tempStringNode.setNode("String Test");
		stringQueue.enqueue(tempStringNode);
		tempStringNode.setNode("String Test 2 ");
		stringQueue.enqueue(tempStringNode);
		tempStringNode.setNode("String Test 3 ");
		stringQueue.enqueue(tempStringNode);
		tempStringNode.setNode("String Test 4 ");
		stringQueue.enqueue(tempStringNode);
		tempStringNode.setNode("String Test 5 ");
		
		System.out.println("Dequeues:");
		tempStringNode = stringQueue.dequeue();
		System.out.println(tempStringNode.getNodeData());
		System.out.println("Front = " + stringQueue.getFront().getNodeData());
		
		tempStringNode = stringQueue.dequeue();
		System.out.println(tempStringNode.getNodeData());
		System.out.println("Front = " + stringQueue.getFront().getNodeData());
		
		tempStringNode = stringQueue.dequeue();
		System.out.println(tempStringNode.getNodeData());
		System.out.println("Front = " + stringQueue.getFront().getNodeData());
		
		tempStringNode = stringQueue.dequeue();
		System.out.println(tempStringNode.getNodeData());
		System.out.println("Front = " + stringQueue.getFront().getNodeData());
	}
}
