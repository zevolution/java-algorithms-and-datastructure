package br.com.zevolution.datastructure.linkedlist;

public class InvalidPosition extends RuntimeException {

	private static final long serialVersionUID = -3536404610449816152L;
	
	public InvalidPosition() {
		super("Invalid position");
	}
	
	public InvalidPosition(String message) {
		super(message);
	}

}
