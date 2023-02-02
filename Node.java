
public class Node<T> {
	public T data;
	public Node next;

	public Node(T t, Node next) {
		this.data = t;
		this.next = next;
	}
	// put <t> after public class Node<t> to let user define object

}
