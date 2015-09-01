package org.lear.course.patterns.state;

public class PendingApproval implements StudentState {

	private Student student;
	
	public PendingApproval(Student student) {
		this.student = student;
	}
	
	@Override
	public void startCourse() {
		System.out.println(this.student.getName() + " Cant start a new Course");
	}

	@Override
	public void missClass() {
		System.out.println(this.student.getName() + " wakes up very late to go to class");
		this.student.setState(this.student.getDiscouraged());
	}

	@Override
	public void takeTest() {
		System.out.println(this.student.getName() + " takes a test ...");
		if (Math.random() < 0.5) {
			this.student.setState(this.student.getDiscouraged());
		} else {
			this.student.setState(this.student.getApproved());
		}
	}

	@Override
	public String toString() {
		return "PendingApproval [student=" + student.getName() + "]";
	}
	
}
