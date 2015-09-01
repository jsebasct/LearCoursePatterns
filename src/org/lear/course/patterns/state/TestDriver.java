package org.lear.course.patterns.state;

/**
 * Realizar un ejemplo en java de un sistema universitario donde sus alumnos puedan estar en
 * 4 diferentes estados
 * ausente , desaprobado, aprobado y pendiente de aprobación.
 * 
 * @author jscruz
 */
public class TestDriver {

	public static void main(String[] args) {
		
		Student peter = new Student(1, "Peter", "Smith");
		Student adam = new Student(2, "Adam", "Parker");
	
		peter.startCourse();
		peter.takeTest();
		
		System.out.println(peter.getStateDescription());
		
		adam.startCourse();
		adam.missClass();
		adam.takeTest();
		
		System.out.println(adam.getStateDescription());
	}

}
