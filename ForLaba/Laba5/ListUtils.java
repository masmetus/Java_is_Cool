package Laba5;
public class ListUtils {

    public static Elements insert(Elements first, int value) {
        Elements p = new Elements(value);
        p.SetNext(first);
        return p;
    }

    public static Elements filter(Elements first) {
        Elements p = null;
        while (first != null) {
            if (first.getValue() % 3 == 0) {
                p = insert(p, first.getValue());
            }
            first = first.getNext();
        }
        return p;
    }

    public static Elements map(Elements first) {
        if (first == null) {
            return null;
        }
        int value = first.getValue();
        return insert(map(first.getNext()), value * value * value);
    }

    public static int reduce(Elements first) {
        int rez = 0;
        while (first != null) {
            rez += first.getValue();
            first = first.getNext();
        }
        return rez;
    }
}
