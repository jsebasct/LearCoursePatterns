package org.lear.course.patterns.singleton;

/**
 * Realice un ejemplo en java una clase Player, para un juego que solo maneja una instancia de dicha clase.
 * 
 * @author jscruz
 */
public class Driver {
	
	public static void main(String[] args) {
		Game game = Game.getInstance();
		game.addPlayer(new Player("Juancito"));
		game.addPlayer(new Player("Pedrito"));

		System.out.println(Game.getInstance().getPlayers());
	}
}
