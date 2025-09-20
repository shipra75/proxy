package DesignBookMyShow;

import java.util.ArrayList;

public class Theatre {
    int theatreId;
    String Address;
    City city;
    List<Screen> screen = new ArrayList<>();
    List<Show> shows = new ArrayList<>();
    public int getTheatre(){return theatreId;}
    public void setTheatreId(int theatreId)
    {
        this.theatreId= theatreId
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address= Address;
    }
    public List<Screen> getScreen(){return screen;}
    public void setScreen(List<Screen>screen){this.screen=screen}
    public List<Show> getShow(){return shows}
    public void setShow(List<Show> shows){this.shows=shows}
    public City getCity(){
        return city;
    }
    public void setCity()(City city){this.city=city;}



}
