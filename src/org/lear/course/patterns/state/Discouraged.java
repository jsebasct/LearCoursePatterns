package org.lear.course.patterns.state;

public class Discouraged implements StudentState {

	private Student student;
	
	public Discouraged(Student student) {
		this.student = student;
	}
	
	@Override
	public void startCourse() {
		System.out.println(student.getName() + " starts a new course");
		this.student.setState(this.student.getPendingApproval());
	}

	@Override
	public void missClass() {
		System.out.println(student.getName() + " keeps missing classes");
	}

	@Override
	public void takeTest() {
		System.out.println(student.getName() + " cant take a test");
	}

	@Override
	public String toString() {
		return "Desaprobo [student=" + student.getName() + "]";
	}

	
}
