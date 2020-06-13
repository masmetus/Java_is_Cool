package timetable;
import java.util.Calendar;
public class Lect_Sort implements Lectures {
    private Calendar start;
    private  Calendar end;
    private String name;

    public String GetName(){
        return name;
    }

    public Calendar GetStart() {
        return start;
    }

    public Calendar GetEnd() {
        return end;
    }
    public Lect_Sort(Calendar StartTime, Calendar EndTime, String name){
        start=StartTime;
        end=EndTime;
        this.name=name;
    }
}