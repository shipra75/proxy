package DesignBookMyShow;

public class Movie {
   int movieId;
   String movieName;
   int movieDurationInMinutes;
   public int getMovie() {
       return movieId;
    }
    public void setMovieId(int movieId)
    {
        this.movieId =movieId;
    }
    public String getMovieName() {
       return movieName;
    }
    public void setMovieName(String movieName) {
       this.movieName = movieName;
    }
    public int getMovieDuration() {
       return movieDurationInMinutes;
    }
    public void setMovieDuration(int movieDuration) {
        this.movieDurationInMinutes = movieDuration;
    }
}
