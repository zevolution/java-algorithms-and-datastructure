package br.com.zevolution.datastructure.set;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomSetTest {

	@Test
	public void should_Contain_OneRecordInCustomSet() {
		CustomSet set = new CustomSet();
		set.add("José Lucas");
		
		assertEquals(1, set.size());
	}
	
	@Test
	public void should_Be_Empty() {
		CustomSet set = new CustomSet();
		set.add("José Lucas");
		
		set.remove("José Lucas");
		
		assertEquals(0, set.size());
	}
	
	@Test
	public void should_NotBe_Duplicated() {
		CustomSet set = new CustomSet();
		set.add("José Lucas");
		set.add("José Lucas");
		set.add("José Lucas");
		
		assertEquals(1, set.size());
	}
	
	@Test
	public void should_Has_Word() {
		CustomSet set = new CustomSet();
		set.add("José Lucas");
		
		assertEquals(true, set.has("José Lucas"));
	}

}
