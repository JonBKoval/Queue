
public class Node<V> {
	private V data;
	private Node<V> nextNode;
	private Node<V> lastNode;
	
	// Default Constructor
	public Node(){
		this(null, null, null);
	}

	// Constructor
	public Node(V item, Node<V> next, Node<V> last) {
		this.data = item;
		this.nextNode = next;
		this.lastNode = last;
	}
	
	public V getNodeData() {
		return data;
	}
	
	public Node<V> getNext() {
		return nextNode;
	}
	
	public Node<V> getPrev() {
		return lastNode;
	}
	
	public void setNode(V item) {
		this.data = item;
	}
	
	public void setNext(Node<V> next) {
		this.nextNode = next;
	}
	
	public void setLast(Node<V> last) {
		this.lastNode = last;
	}
}
