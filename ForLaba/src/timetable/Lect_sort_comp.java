package timetable;
import java.util.Comparator;
public class Lect_sort_comp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Lect_Sort l1=(Lect_Sort) o1;
        Lect_Sort l2=(Lect_Sort) o2;
        int rez=Long.toString(l1.GetStart().getTimeInMillis()).compareTo(Long.toString(l2.GetStart().getTimeInMillis()));
        if (rez!=0){
            return rez;
        }
        rez=Long.toString(l1.GetEnd().getTimeInMillis()).compareTo(Long.toString(l2.GetEnd().getTimeInMillis()));
        return rez;
    }
}
