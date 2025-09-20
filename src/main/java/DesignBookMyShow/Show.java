package DesignBookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    Screen screen;
    int showTime;
    List<Integer> bookSeatIds = new ArrayList<>();
    public int getShowID(){return showId;}
    public void setShowId(int showId){this.showId=showId;}
    public Movie getMovie(){return movie;}
    public void setMovie(Movie movie){this.movie =movie;}
    public Screen getScreen(){return screen;}
    public void setScreen(Screen screen){this.screen =screen;}
    public int getshowTime(){return showTime;}
    public void setShowTime(int showTime){this.showTime=showTime;}
    public List<Integer> getbookSeatsIds(){return bookSeatIds;}
    public void setBookseatsIds(List<Integer>bookSeatIds){this.bookSeatIds= bookSeatIds;}
}
