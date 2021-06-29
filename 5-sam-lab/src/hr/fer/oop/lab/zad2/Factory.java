package hr.fer.oop.lab.zad2;

class Factory {
	
	public static Game createGame(String name, int rating) {
		Game game = new MyGame(name, rating);
		return game;
	}
}
