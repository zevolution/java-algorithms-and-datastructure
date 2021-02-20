package br.com.zevolution.datastructure.linkedlist;

import java.util.NoSuchElementException;

public class CustomLinkedList {
	
	private Node first = null;
	private Node last = null;
	private int totalElements = 0;
	
	public void addFirst(Object element) {
		Node node = new Node(element, this.first);
		this.first = node;
		
		if (this.totalElements == 0) {
			this.last = this.first;
		}
		
		this.totalElements++;
	}
	
	public void add(Object element) {
		if (this.totalElements == 0) {
			this.addFirst(element);
		} else {
			Node node = new Node(element, null);
			this.last.setNext(node);
			this.last = node;
			this.totalElements++;
		}
	}
	
	public void add(int position, Object element) {
		if (!this.isValidContentPosition(position)) 
			throw new UnoccupiedPosition();
		
		if (position == 0) {
			this.addFirst(element);
		} else if (position == this.totalElements) {
			this.add(element);
		} else {
			Node previousNode = this.getNode(position - 1);
			Node node = new Node(element, previousNode.getNext());
			previousNode.setNext(node);
			this.totalElements++;
		}
	}
	
	public void removeFirst() {
		if (this.totalElements == 0) 
			throw new NoSuchElementException();
		
		this.first = this.first.getNext();
		this.totalElements--;
		
		if (this.totalElements == 0) { 
			this.last = null;
		}
	}

	public Object get(int position) {
		return this.getNode(position).getElement();
	}
	
	public int size() {
		return this.totalElements;
	}
	
	@Override
	public String toString() {
		if (this.totalElements == 0) return "[]";

		Node node = this.first;
		
		StringBuilder builder = new StringBuilder("[");
		
		for (int i = 0; i < this.totalElements -1; i++) {
			builder.append(node.getElement()).append(", ");
			node = node.getNext();
		}
		
		builder.append(node.getElement()).append("]");
		
		return builder.toString(); 
	}
	
	private boolean isValidContentPosition(int position) {
		return position >= 0 && position < this.totalElements;
	}
	
	private Node getNode(int position) {
		if (!this.isValidContentPosition(position)) 
			throw new UnoccupiedPosition();
		
		Node node = this.first;
		for (int i = 0; i < position; i++) {
			node = node.getNext();
		}
		return node;
	}
	

}
