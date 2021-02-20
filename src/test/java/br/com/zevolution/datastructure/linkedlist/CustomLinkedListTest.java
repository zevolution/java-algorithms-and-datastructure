package br.com.zevolution.datastructure.linkedlist;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class CustomLinkedListTest {

	@Test
	public void should_Contain_OneRecordInCustomLinkedList() {
		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.add("José Lucas");
		
		assertEquals(1, linkedList.size());
	}
	
	@Test
	public void should_Contain_TwoRecordsInCustomLinkedList() {
		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.add("Beatriz");
		linkedList.add("José Lucas");
		
		assertEquals(2, linkedList.size());
	}
	
	@Test
	public void should_MakeSure_ObjectPosition() {
		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.add("Beatriz");
		linkedList.add("José Lucas");
		linkedList.add(0, "Laura");
		
		assertEquals("Laura", linkedList.get(0));
		assertEquals("Beatriz", linkedList.get(1));
		assertEquals("José Lucas", linkedList.get(2));
	}
	
	@Test
	public void should_MakeSure_AddFirst_ObjectPosition() {
		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.add("Beatriz");
		linkedList.add("José Lucas");
		linkedList.addFirst("Laura");
		
		assertEquals("Laura", linkedList.get(0));
		assertEquals("Beatriz", linkedList.get(1));
		assertEquals("José Lucas", linkedList.get(2));
	}
	
	@Test
	public void should_MakeSure_RemoveFirst_ObjectPosition() {
		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.add("Beatriz");
		linkedList.add("Laura");
		linkedList.addFirst("José Lucas");
		
		linkedList.removeFirst();
		
		assertNotEquals("José Lucas", linkedList.get(0));
		assertEquals("Beatriz", linkedList.get(0));
		assertEquals(2, linkedList.size());
	}
	
	@Test
	public void should_Be_Empty() {
		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.add("Beatriz");
		linkedList.add("José Lucas");
		linkedList.add("Laura");
		
		for (int i = linkedList.size(); i > 0; i--) {
			linkedList.removeFirst();
		}
		
		assertEquals(0, linkedList.size());
	}
	
	
	@Test(expected = UnoccupiedPosition.class)
	public void should_ThrowException_When_UnoccupiedPosition() {
		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.add("zevolution");
		
		linkedList.add(1, "noitulovez");;
	}
	
	@Test(expected = NoSuchElementException.class)
	public void should_ThrowException_When_NoSuchElement() {
		CustomLinkedList linkedList = new CustomLinkedList();
		
		linkedList.removeFirst();
	}	

}
