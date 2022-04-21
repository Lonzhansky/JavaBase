package com.hillel.lonzhansky.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        4. Практика No1:
//        вывод только четных с помощью цикла FOR
//        вывод только НЕчетных с помощью цикла FOR

//        System.out.println("start loop");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//
//            }
//            if (i % 2 != 0) {
//                System.out.println("i = " + i);
//            }
//        }
//
//        System.out.println("after loop");


//        for (byte i = 0; i > -1; i++) {
//            System.out.println(i);
//        }
//        System.out.println("end loop");

        int i = 0;
        int player1Team1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number");
//
        while (true) {
           if (scanner.hasNextInt()) {
               player1Team1 = scanner.nextInt();
               break;
           } else {
               scanner.next();
               System.out.println("wrong input. try again");
           }
        }

//        System.out.println("player1 = " + player1Team1);

//        do {
//            System.out.println(i);
//        } while (i == 5);





//        Сделайте бомбу с обратным отсчетом от 10 до 0 с помощью цикла WHILE
//        добавьте к вашей бомбе условие, что если бомба разминирована, она не взорвется

//        bomb();


        // Вычислить факториал числа от 0 до N (вводим из консоли)
//        System.out.println(getFactorial(5));


//        Выведите на экран первые 11 членов последовательности Фибоначчи
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
//        getFibonachi();


//        В Японии числа 4 и 9 считаются несчастливыми. Вам нужно пронумеровать
//        100 космических шаттлов для перевозки людей на Марс так, чтобы в
//        номерах шаттлов не попадалось несчастливых чисел. Напишите функцию,
//        которая выводит все номера таких шаттлов.
        getShuttleNumber();

    }

    public static void bomb() {
        int timer = 10;
        boolean demined = false;

        while (timer > 0) {
            System.out.println(timer);

            int rand = (int) (Math.random() * 50); // 0.0 - 0.999999999999999999999999999999999

            if (rand > 40) {
                System.out.println("GOOD");
                demined = true;
                break;
            }

            timer--;
        }
        if (!demined) {
            System.out.println("BOOM!!!");
        }
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }

    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    public static void getFibonachi() {
        int number1 = 1;
        int number2 = 1;
        int sum;

        System.out.print(number1 + " " + number2 + " ");
        for (int i = 3; i <= 11; i++) {
            sum = number1 + number2;
            System.out.print(sum + " ");
            number1 = number2;
            number2 = sum;
        }
    }

//        В Японии числа 4 и 9 считаются несчастливыми. Вам нужно пронумеровать
//        100 космических шаттлов для перевозки людей на Марс так, чтобы в
//        номерах шаттлов не попадалось несчастливых чисел. Напишите функцию,
//        которая выводит все номера таких шаттлов.

    // 1 2 3 5 6 7 8 10 11 145


    // 40- 49
    // 14
    // 54
    // 90 - 91
    public static void getShuttleNumber() {
        int countShuttle = 0;
        while (countShuttle <= 100) {
            System.out.println("countShuttle = " + countShuttle);
           if (check(countShuttle)) {
               continue;
           }
           countShuttle++;
           System.out.println("countShuttle = " + countShuttle);
       }
    }

    public static boolean check(int number) {
        return true;
    }
}
