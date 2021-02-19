package br.com.zevolution.datastructure.sequentialvector;

import java.util.Arrays;

public class StudentsVector {
	
	private Student[] students = new Student[2];
	private int totalStudents = 0;
	
	public void add(Student student) {
		this.grow();
		/* 
		   for (int i = 0; i < students.length; i++) {
		    if (this.students[i] == null) {
				this.students[i] = student;
				break;
			}
		}*/
		this.students[totalStudents] = student;
		this.totalStudents++;
	}
	
	public void add(int position, Student student) {
		this.grow();
		
		if (!this.isValidPosition(position)) {
			throw new InvalidPosition();
		}
		
		for (int i = this.totalStudents - 1; i >= position; i--) {
			this.students[i+1] = this.students[i];
		}
		this.students[position] = student;
		this.totalStudents++;
	}
	
	public void remove(int position) {
		if (!this.isValidContentPosition(position)) {
			throw new UnoccupiedPosition();
		}
		
		for (int i = position; i < this.totalStudents; i++) {
			this.students[i] = this.students[i+1];
		}
		
		this.totalStudents--;
		this.students[this.totalStudents] = null;
	}
	
	public Student get(int position) {
		if (!this.isValidContentPosition(position)) {
			throw new UnoccupiedPosition();
		}
		return this.students[position];
	}
	
	public boolean has(Student student) {
		/*for (int i = 0; i < students.length; i++) {*/
		for (int i = 0; i < this.totalStudents; i++) {
			if (student.equals(this.students[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return this.totalStudents;
	}
	
	public String toString() {
		return Arrays.toString(this.students);
	}
	
	private boolean isValidContentPosition(int position) {
		return position >= 0 && position < this.totalStudents;
	}
	
	private boolean isValidPosition(int position) {
		return position >= 0 && position <= this.totalStudents;
	}
	
	private void grow() {
		if (this.totalStudents == this.students.length -1) {
			Student[] newStudentsArray = new Student[this.students.length*2];
			for (int i = 0; i < this.students.length; i++) {
				newStudentsArray[i] = this.students[i];
			}
			this.students = newStudentsArray;
		}
	}

}
