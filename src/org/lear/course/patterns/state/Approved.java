package org.lear.course.patterns.state;

public class Approved implements StudentState {

	private Student student;
	
	public Approved(Student student) {
		this.student = student;
	}
	
	@Override
	public void startCourse() {
		System.out.println(this.student.getName() + " comienza un curso");
		this.student.setState(this.student.getPendingApproval());
	}

	@Override
	public void missClass() {
		System.out.println(this.student.getName() + " the classes have ended !");
	}

	@Override
	public void takeTest() {
		System.out.println(this.student.getName() + " cant take the test again !");
	}

	@Override
	public String toString() {
		return "Approved [student=" + student.getName() + "]";
	}
	
}
