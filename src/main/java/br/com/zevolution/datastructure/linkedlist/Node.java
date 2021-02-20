package br.com.zevolution.datastructure.linkedlist;

public class Node {
	
	private Node next;
	private Object element;
	
	public Node(Object element, Node next) {
		this.element = element;
		this.next = next;
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
