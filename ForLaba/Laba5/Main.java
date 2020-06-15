package Laba5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Размер: ");
        int N = scanner.nextInt();
        Elements first=null;
        System.out.print("Введите элементы: ");
        for (int i=0; i<N; i++) {
            int variable = scanner.nextInt();
            first=ListUtils.insert(first,variable);
        }
        System.out.println();
        Elements p=ListUtils.filter(first);
        System.out.println("Остаток от 3 = 0 ");
        print(p);
        p=null;
        try{
            int result = ListUtils.reduce(ListUtils.map(ListUtils.filter(first)));
            System.out.println("Сумма кубов = " + result);
        }catch (NullPointerException ex){
            System.out.println("Отсутсвуют элементы");
        }
    }
    static void print(Elements p){
        while (p!=null){
            System.out.println(p.getValue());
            p=p.getNext();
        }
    }
}