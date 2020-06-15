package Laba3;
import ForInter.ichecks;

public class DecreasingRow implements ichecks {
    public static String Char;

    public DecreasingRow(String str) {
        Char = str;
    }
    public boolean check() {
        return method(Char);
    }

    boolean method(String str) {
        boolean bool;
        bool = false;
        label1:
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) >= str.charAt(j)) {
                    bool = true;
                } else {
                    bool = false;
                    break label1;
                }
            }
        }
        return bool;
    }
}
