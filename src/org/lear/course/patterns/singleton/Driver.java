package org.lear.course.patterns.singleton;

public class Driver {
	
	public static void main(String[] args) {
		Game game = Game.getInstance();
		game.addPlayer(new Player("Juancito"));
		game.addPlayer(new Player("Pedrito"));

		System.out.println(Game.getInstance().getPlayers());
	}
}
