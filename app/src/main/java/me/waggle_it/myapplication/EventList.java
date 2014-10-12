package me.waggle_it.myapplication;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by Elliott on 10/11/2014.
 */
public class EventList {
    private List<Event> events;

    public EventList()
    {
        events =  new ArrayList<Event>();
    }
    public void addEvent(Event e){
        events.add(e);
    }
    public List<Event> getEventList(){
        return events;
    }
}
