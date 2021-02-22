package br.com.zevolution.datastructure.doublylinkedlist;

public class Node {
	
	private Node previous;
	private Node next;
	private Object element;	
	
	public Node(Object element) {
		this(element, null);
	}
	
	public Node(Object element, Node next) {
		this.element = element;
		this.next = next;
	}
	
	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getElement() {
		return element;
	}
	
}
