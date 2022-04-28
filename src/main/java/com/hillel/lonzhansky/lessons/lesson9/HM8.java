package com.hillel.lonzhansky.lessons.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HM8 {
    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        final int ARRAY_LENGTH = 7;

        int[] arrayGroup = new int[ARRAY_LENGTH];
        int[] arrayPlayer = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arrayGroup[i] = (int) (Math.random() * 10);
        }

        System.out.println("Please enter number from 0 to 9");
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arrayPlayer[i] = getNumber(scanner);
        }

        Arrays.sort(arrayGroup);
        Arrays.sort(arrayPlayer);

        int count = 0;
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (arrayGroup[i] == arrayPlayer[i]) {
                count++;
            }
        }

        System.out.println(Arrays.toString(arrayGroup));
        System.out.println(Arrays.toString(arrayPlayer));
        System.out.println("Count = " + count);
    }

    public static int getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 0 && number <= 9) {
                    return number;
                } else {
                    System.out.println("Please enter number from 0 to 9");
                }
            } else {
                System.out.println("Please enter number");
                scanner.next();
            }
        }
    }


    public static void task2() {
        final int ARRAY_LENGTH = 50_000;
        int[] array = new int[ARRAY_LENGTH];
        int[] array2 = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = array2[i] = (int) (Math.random() * 10);
        }
//        System.out.println(Arrays.toString(array));
        long time = System.currentTimeMillis();
        cocktailSort(array);
        System.out.println(System.currentTimeMillis() - time);
//        System.out.println(Arrays.toString(array));
        long time2 = System.currentTimeMillis();
        cocktailSort2(array2);
        System.out.println(System.currentTimeMillis() - time2);
//        System.out.println(Arrays.toString(array2));


    }

    public static void cocktailSort(int[] array) {
        int minIndex = 0;
        int maxIndex = array.length - 1;

        int count = 0;
        while (minIndex < maxIndex) {
            count++;
            for (int i = minIndex; i < maxIndex; i++) {
                count++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            maxIndex--;
            for (int i = maxIndex; i > minIndex; i--) {
                count++;
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            minIndex++;
        }
        System.out.println("count: " + count);
    }

    public static void cocktailSort2(int[] array) {
        int minIndex = 0;
        int maxIndex = array.length - 1;

        int count = 0;
        while (minIndex < maxIndex) {
            count++;
            for (int i = minIndex, j = maxIndex;
                 i < maxIndex || j > minIndex;
                 i++, j--) {
                count++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            maxIndex--;
            minIndex++;
        }
        System.out.println("count: " + count);
    }
}
