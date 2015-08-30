package org.lear.course.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private static volatile Game uniqueInstance;
	private List<Player> players;
	
	private Game() {
		players = new ArrayList<Player>();
	}
	
	public void addPlayer(Player newPlayer) {
		players.add(newPlayer);
	}
	
	public StringBuilder getPlayers() {
		StringBuilder res = new StringBuilder();
		for(Player somePlayer : this.players) {
			res.append(">> Player Name: " + somePlayer.getName()+"\n");
		}
		return res;
	}
	
	public static Game getInstance() {
		if (uniqueInstance == null) {
			synchronized (Game.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Game();				
				}
			}
		}
		
		return uniqueInstance;
	}
	
}
