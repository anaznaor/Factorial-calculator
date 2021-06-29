package hr.fer.oop.lab.zad2;

import java.util.*;

public class MyPlayer extends Player implements Iterable<Game>{
	private Map<Game, List<Integer>> games = new LinkedHashMap<>();
	
	protected MyPlayer(String name) {
		super(name);
	}

	@Override
	void addGameScore(Game game, int score) {
		if(!games.containsKey(game))
			games.put(game, new LinkedList<>());
		games.get(game).add(score);
		
	}

	@Override
	Iterable<Integer> getScores(Game game) {
		return new Iterable<Integer>() {

			@Override
			public Iterator<Integer> iterator() {
				return games.get(game).iterator();
			}
			
		};
	}

	@Override
	public Iterator<Game> iterator() {
		Set<Game> names = new TreeSet<>((g1,g2)->g1.getName().compareTo(g2.getName()));
		names.addAll(games.keySet());
		return names.iterator();
	}

}
