package org.lear.course.patterns.state;

public class Student {

	private int dni;
	private String name;
	private String lastName;
	private StudentState state;

	private StudentState absent;
	private StudentState approved;
	private StudentState discouraged;
	private StudentState pendingApproval;

	public Student(int dni, String name, String lastName) {
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;

		absent = new Absent(this);
		approved = new Approved(this);
		discouraged = new Discouraged(this);
		pendingApproval = new PendingApproval(this);

		this.state = absent;
	}

	public int getDNI() {
		return this.dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStateDescription() {
		return this.state.toString();
	}
	
	public StudentState getState() {
		return state;
	}

	public void setState(StudentState state) {
		this.state = state;
	}
	
	
	public int getDni() {
		return dni;
	}

	public StudentState getAbsent() {
		return absent;
	}

	public StudentState getApproved() {
		return approved;
	}

	public StudentState getDiscouraged() {
		return discouraged;
	}

	public StudentState getPendingApproval() {
		return pendingApproval;
	}

	// actions - states
	public void startCourse() {
		this.state.startCourse();
	}
	
	public void missClass() {
		this.state.missClass();
	}

	public void takeTest() {
		this.state.takeTest();
	}
}
