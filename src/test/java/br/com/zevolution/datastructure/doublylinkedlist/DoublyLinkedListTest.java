package br.com.zevolution.datastructure.doublylinkedlist;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class DoublyLinkedListTest {

	@Test
	public void should_Contain_OneRecordInDoublyLinkedList() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add("José Lucas");
		
		assertEquals(1, doublyLinkedList.size());
	}
	
	@Test
	public void should_Contain_TwoRecordsInDoublyLinkedList() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add("Beatriz");
		doublyLinkedList.add("José Lucas");
		
		assertEquals(2, doublyLinkedList.size());
	}
	
	@Test
	public void should_MakeSure_ObjectPosition() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add("Beatriz");
		doublyLinkedList.add("José Lucas");
		doublyLinkedList.add(0, "Laura");
		
		assertEquals("Laura", doublyLinkedList.get(0));
		assertEquals("Beatriz", doublyLinkedList.get(1));
		assertEquals("José Lucas", doublyLinkedList.get(2));
	}
	
	@Test
	public void should_MakeSure_AddFirst_ObjectPosition() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add("Beatriz");
		doublyLinkedList.add("José Lucas");
		doublyLinkedList.addFirst("Laura");
		
		assertEquals("Laura", doublyLinkedList.get(0));
		assertEquals("Beatriz", doublyLinkedList.get(1));
		assertEquals("José Lucas", doublyLinkedList.get(2));
	}
	
	@Test
	public void should_MakeSure_RemoveFirst_ObjectPosition() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add("José Lucas");
		doublyLinkedList.add("Beatriz");
		doublyLinkedList.add("Laura");
		
		doublyLinkedList.removeFirst();
		
		assertNotEquals("José Lucas", doublyLinkedList.get(0));
		assertEquals("Beatriz", doublyLinkedList.get(0));
		assertEquals(2, doublyLinkedList.size());
	}
	
	@Test
	public void should_MakeSure_RemoveLast_ObjectPosition() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add("Beatriz");
		doublyLinkedList.add("Laura");
		doublyLinkedList.add("José Lucas");
		
		doublyLinkedList.removeLast();
		
		int lastPosition = doublyLinkedList.size() - 1;
		assertNotEquals("José Lucas", doublyLinkedList.get(lastPosition));
		assertEquals("Laura", doublyLinkedList.get(lastPosition));
		assertEquals(2, doublyLinkedList.size());
	}
	
	@Test
	public void should_MakeSure_RemovePosition_ObjectPosition() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add("Beatriz");
		doublyLinkedList.add("José Lucas");
		doublyLinkedList.add("Laura");
		
		doublyLinkedList.remove(1);
		
		assertNotEquals("José Lucas", doublyLinkedList.get(1));
		assertEquals("Beatriz", doublyLinkedList.get(0));
		assertEquals("Laura", doublyLinkedList.get(1));
		assertEquals(2, doublyLinkedList.size());
	}
	
	@Test
	public void should_Be_Empty() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add("Beatriz");
		doublyLinkedList.add("José Lucas");
		doublyLinkedList.add("Laura");
		
		for (int i = doublyLinkedList.size(); i > 0; i--) {
			doublyLinkedList.removeFirst();
		}
		
		assertEquals(0, doublyLinkedList.size());
	}
	
	
	@Test(expected = UnoccupiedPosition.class)
	public void should_ThrowException_When_UnoccupiedPosition() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add("zevolution");
		
		doublyLinkedList.add(1, "noitulovez");
	}
	
	@Test(expected = NoSuchElementException.class)
	public void should_ThrowException_When_NoSuchElement() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		
		doublyLinkedList.removeFirst();
	}	

}
