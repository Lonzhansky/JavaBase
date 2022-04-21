package com.hillel.lonzhansky.lessons.lesson6;

import java.util.Scanner;

public class HM5 {
    public static void main(String[] args) {
        recursion(0);
    }

    public static void recursion(int i) {
        System.out.println("start: " + i);
        if (i < 3) {
            i++;
            recursion(i);
            System.out.println("middle: " + i);
        }
        System.out.println("end: " + i);
    }

    public static boolean isLeapYear(int year) {
        boolean result = (year % 4 == 0) && (year % 100 != 0) || (year %400 == 0);
        return result;
    }

    public static int accerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if ((m > 0) && (n == 0)) {
            return accerman(m - 1, 1);
        } else {
            return accerman(m -1, accerman(m, n -1));
        }
    }
}
