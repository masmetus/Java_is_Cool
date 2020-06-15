package com;

import Laba3.AscendingRow;
import Laba3.DecreasingRow;

import java.util.Scanner;

public class Main {
    static boolean ruslang (String s) {
        boolean bool = false;
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if ((tmp >= 'а') && (tmp <= 'я') ) {
                bool = true;
                break;
            }
        }
        if (bool) {
            System.out.println("Были введены некорректные данные");
            System.out.println("Попробуйте ещё раз");
        }
        return bool;
    }

    public static void main(String[] args) {
        System.out.println("Введите строку, состоящую из латинских символов от 'a' до 'z' для анализа");
        String chk;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                chk = scanner.next();
            }
            while (ruslang(chk));
        }

        AscendingRow ascendingRow = new AscendingRow(chk);
        DecreasingRow decreasingRow = new DecreasingRow(chk);
        if (decreasingRow.check())
            System.out.println("Монотонно убывающая строка");
        else if (ascendingRow.check()) {
            System.out.println("Монотонно возрастающая строка");
        } else {
            System.out.println("В введённой строке не содержится мотонно убывающих или возрастающих символов");
        }
    }
}