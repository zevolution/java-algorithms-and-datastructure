package br.com.zevolution.datastructure.sequentialvector;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentsVectorTest {

	@Test
	public void should_Contain_OneRecordInStudentsVector() {
		StudentsVector students = new StudentsVector();
		students.add(new Student("José Lucas"));
		
		assertEquals(1, students.size());
	}
	
	@Test
	public void should_Contain_TwoRecordsInStudentsVector() {
		StudentsVector students = new StudentsVector();
		students.add(new Student("Beatriz"));
		students.add(new Student("José Lucas"));
		
		assertEquals(2, students.size());
	}
	
	@Test
	public void should_MakeSure_StudentsPosition() {
		StudentsVector students = new StudentsVector();
		students.add(new Student("Beatriz"));
		students.add(new Student("José Lucas"));
		students.add(0, new Student("Laura"));
		
		assertEquals("Laura", students.get(0).getName());
		assertEquals("Beatriz", students.get(1).getName());
		assertEquals("José Lucas", students.get(2).getName());
	}
	
	@Test
	public void should_Be_Empty() {
		StudentsVector students = new StudentsVector();
		students.add(new Student("Beatriz"));
		students.add(new Student("José Lucas"));
		students.add(0, new Student("Laura"));
		
		for (int i = students.size(); i > 0; i--) {
			students.remove(i-1);
		}
		
		assertEquals(0, students.size());
	}
	
	@Test
	public void should_Have_StudentLu() {
		StudentsVector students = new StudentsVector();
		students.add(new Student("Beatriz"));
		students.add(new Student("José Lucas"));
		students.add(0, new Student("Laura"));
		students.add(new Student("Lu"));
		
		assertEquals(true, students.has(new Student("Lu")));
	}
	
	@Test(expected = UnoccupiedPosition.class)
	public void should_ThrowException_When_UnoccupiedPosition() {
		StudentsVector students = new StudentsVector();
		students.add(new Student("zevolution"));
		
		students.remove(1);
	}
	
	@Test(expected = InvalidPosition.class)
	public void should_ThrowException_When_InvalidPosition() {
		StudentsVector students = new StudentsVector();
		
		students.add(1, new Student("zevolution"));
	}	

}
