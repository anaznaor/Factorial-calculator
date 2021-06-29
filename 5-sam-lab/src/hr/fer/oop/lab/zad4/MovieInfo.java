package hr.fer.oop.lab.zad4;

class MovieInfo {
    private String movieName;
    
    private int IMDBRating;
    private int rottenTomatoesRating;
    
    private String director;
    private int year;
    
    public MovieInfo(int IMDBRating, int rottenTomatoesRating, String director, int year, String name) {
        this.IMDBRating=IMDBRating;
        this.rottenTomatoesRating=rottenTomatoesRating;
        this.director=director;
        this.year=year;
        this.movieName = name; 
    }

    public String getMovieName() {
        return movieName;
    }
    
    public int getIMDBRating() {
        return IMDBRating;
    }

    public int getRottenTomatoesRating() {
        return rottenTomatoesRating;
    }

    public String getDirector() {
        return director;
    }
    
    public int getYear() {
        return year;
    }
}