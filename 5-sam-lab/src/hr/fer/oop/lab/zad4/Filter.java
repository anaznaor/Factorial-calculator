package hr.fer.oop.lab.zad4;

import java.util.function.Predicate;

class Filter {
	
	public static Predicate<MovieInfo> olderThan(int year){
		return new Predicate<MovieInfo>() {

			@Override
			public boolean test(MovieInfo movie) {
				return movie.getYear() < year;
			}
			
		};
	}
	
	public static Predicate<MovieInfo> byDirectorAndYear(int year, String director){
		return new Predicate<MovieInfo>() {

			@Override
			public boolean test(MovieInfo movie) {
				return movie.getDirector() == director && movie.getYear() > year;
			}
			
		};
	}
	
	public static Predicate<MovieInfo> byRating(int score){
		return new Predicate<MovieInfo>() {

			@Override
			public boolean test(MovieInfo movie) {
				return movie.getIMDBRating() >= score && movie.getRottenTomatoesRating() >= score;
			}
			
		};
	}
}
