package timetable;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Lect_Sort> Lect_Sorts = new ArrayList<>();
        int N;
        Lect_Sort timetable;
        Calendar start, end;
        String name = "", datastring = "";
        System.out.println("Введите число лекций");
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Введите название лекции");
            name = scanner.next();
            System.out.println("Введите начало лекции");
            datastring = scanner.next();
            start = initialize(datastring);
            System.out.println("Введите дату и время конца лекции");
            datastring = scanner.next();
            end = initialize(datastring);
            timetable = new Lect_Sort(start, end, name);
            Lect_Sorts.add(timetable);
        }

        print(Lect_Sorts);
        System.out.println("Результат сортировки");
        sort(Lect_Sorts);
        print(Lect_Sorts);
    }

    static void sort(ArrayList<Lect_Sort> timetable1) {
        Collections.sort(timetable1, new Lect_sort_comp());
    }

    static void print(ArrayList<Lect_Sort> timetable1) {
        for (Lect_Sort l : timetable1) {
            System.out.println("Лекция: " + l.GetName() + "; Начало: " + l.GetStart().getTime() + "; Конец: " + l.GetEnd().getTime());

        }
    }
    static Calendar initialize(String t){
        String[] temp=t.split(";");
        String[] data=temp[0].split("/");
        String[] time=temp[1].split(":");
        int[] intdata=new int[6];
        for (int i=0;i<data.length;i++){
            intdata[i]=Integer.parseInt(data[i]); }
        for (int i=0;i<time.length;i++){ intdata[i+3]=Integer.parseInt(time[i]);
        } if (time.length==2){ intdata[5]=0; }
        Calendar calen=new GregorianCalendar(intdata[0],intdata[1],intdata[2],intdata[3],intdata[4], intdata[5]);
        return calen; }
}
