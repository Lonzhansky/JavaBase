package com.hillel.lonzhansky.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 3;
        int c = 7;

        boolean booleanFalse = false;

//        if (!(a >= b)) {
//            System.out.println("a >= b");
//            if (a > b) {
//                if (a != b) {
//                    System.out.println("a != b");
//                }
//                System.out.println("a > b");
//            }
//            if (a == b) {
//                System.out.println("a == b");
//            }
//        } else {
//            if (a == b) {
//                if (a == b) {
//                }
//            }
//            System.out.println("a < b");
//        }

//        if ((a >= b) && (a < c) && (b == c)) {
//            System.out.println("its true");
//        }

//        if ((a == 6) && (++b == 4)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//        System.out.println(b);
//
//        String str = ((a == 6) && (++b == 4)) ? "YES" : "NO";
//        System.out.println(str);



        String str1 = "a";

        char ch1 = 'a';

        switch (ch1) {
            case 'a' :
                System.out.println("str = a");
                break;
            case 'b':
                System.out.println("str = b");
            case 'c':
                System.out.println("str = c");
                break;
            default:
                System.out.println("default");
                break;

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        if (scanner.hasNextInt()) {
            int myInt = scanner.nextInt();
            System.out.println("You entered: " + myInt);
        } else {
            System.out.println("Wrong data");
        }
        scanner.close();

    }



}
