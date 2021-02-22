package br.com.zevolution.datastructure.doublylinkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	
	private Node first = null;
	private Node last = null;
	private int totalElements = 0;
	
	public void addFirst(Object element) {
		if (this.totalElements == 0) {
			Node node = new Node(element);
			this.first = node;
			this.last = node;
		} else {
			Node node = new Node(element, this.first);
			this.first.setPrevious(node);
			this.first = node;
		}
		
		this.totalElements++;
	}
	
	public void add(Object element) {
		if (this.totalElements == 0) {
			this.addFirst(element);
		} else {
			Node node = new Node(element);
			this.last.setNext(node);
			node.setPrevious(this.last);
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
			Node previousNode = this.getNode(position -1 );
			Node nextNode = previousNode.getNext();
			
			Node node = new Node(element, previousNode.getNext());
			node.setPrevious(previousNode);
			
			previousNode.setNext(node);
			nextNode.setPrevious(node);
			
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
	
	public void removeLast() {
		if (this.totalElements == 1) {
			this.removeFirst();
		} else {
			Node lastButOne = this.last.getPrevious();
			lastButOne.setNext(null);
			this.last = lastButOne;
			this.totalElements--;
		}
	}
	
	public void remove(Object element) {
		Node node = this.hasNode(element);
		if (node == null) return;
		
		if (node.getPrevious() == null) {
			this.removeFirst();
		} else if (node.getNext() == null) {
			this.removeLast();
		} else {
			this.removeNode(node);
		}
	}
	
	public void remove(int position) {
		if (position == 0) {
			this.removeFirst();
		} else if (position == this.totalElements -1) {
			this.removeLast();
		} else {
			Node node = this.getNode(position);
			this.removeNode(node);
		}
	}

	public Object get(int position) {
		return this.getNode(position).getElement();
	}
	
	public int size() {
		return this.totalElements;
	}
	
	public boolean has(Object element) {
		return this.hasNode(element) != null;
	}
	
	private Node hasNode(Object element) {
		Node node = this.first;
		
		while (node != null) {
			if (node.getElement().equals(element)) {
				return node;
			}
			
			node = node.getNext();
		}
		
		return null;
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
	
	private void removeNode(Node node) {
		Node previousNode = node.getPrevious();
		Node nextNode = node.getNext();
		
		previousNode.setNext(nextNode);
		nextNode.setPrevious(previousNode);
		
		node = null;
		
		this.totalElements--;
	}

}
