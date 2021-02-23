package br.com.zevolution.datastructure.set;

import java.util.ArrayList;

import br.com.zevolution.datastructure.doublylinkedlist.DoublyLinkedList;

public class CustomSet {

	private ArrayList<DoublyLinkedList> set = new ArrayList<>(26);
	private int totalElements = 0;
	
	public CustomSet() {
		for (int i = 0; i < 26; i++) {
			this.set.add(new DoublyLinkedList());
		}
	}

	public void add(String word) {
		if (!this.has(word)) {
			this.set.get(this.getHashCode(word)).add(word);
			this.totalElements++;
		}
	}

	public boolean has(String word) {
		return this.set.get(this.getHashCode(word)).has(word);			
	}

	public void remove(String word) {
		if (this.has(word)) {
			this.set.get(this.getHashCode(word)).remove(word);
			this.totalElements--;
		}
	}
	
	public int size() {
		return this.totalElements;
	}

	@Override
	public String toString() {
		return this.set.toString();
	}

	private int getHashCode(String word) {
		if (word != null) {
			return word.toLowerCase().charAt(0) % 26;
		} else {
			throw new NullPointerException();
		}
	}
}