package org.lear.course.patterns.state;

public class Absent implements StudentState {

	private Student student;
	
	public Absent (Student student) {
		this.student = student;
	}
	
	@Override
	public void startCourse() {
		System.out.println(this.student.getName() + " comienza un curso");
		this.student.setState(this.student.getPendingApproval());
	}

	@Override
	public void missClass() {
		System.out.println(this.student.getName() + "Can't miss a Class");
	}

	@Override
	public void takeTest() {
		System.out.println(this.student.getName() +  "Can't take test");
	}

	@Override
	public String toString() {
		return "Absent [student=" + student.getName() + "]";
	}
	
}
