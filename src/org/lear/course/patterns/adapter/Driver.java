package org.lear.course.patterns.adapter;

/**
 * Realizar un ejemplo de un sistema con una clase Saludo que genere un output "Hola", 
 * luego crear clases capaces de adaptar el saludo a diferentes idiomas.
 * 
 * @author jscruz
 */
public class Driver {

	public static void main(String[] args) {
		Greetable saludador = new EnglishNew();
		System.out.println(saludador.sayHi());
		
		// adapting to spanish
		Spanish saludadorEspaniol = new Spanish();
		saludador = new SpanishAdapter(saludadorEspaniol);
		System.out.println(saludador.sayHi());
		
		// Adapting to frances
		Frances saludadorFrances = new Frances();
		saludador = new FrancesAdapter(saludadorFrances);
		System.out.println(saludador.sayHi());
	}

}
