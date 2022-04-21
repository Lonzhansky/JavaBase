package com.hillel.lonzhansky.lessons.lesson8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task3();

    }

    public static void bubbleSort(int[] array) {
        int temp;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                count++;
            }
            count++;
        }
    }


    public static void bubbleSortReverse(int[] array) {
        int temp;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                count++;
            }
            count++;
        }
    }

//    a. Задать массив целых чисел длиной N элементов заполнить его рандомными числами
//     отсортировать его и вывести на экран поменять первый и последний элемент местами, вывести массив на экран еще раз
    
    public static void task1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        System.out.println(Arrays.toString(array));
        
    }


//    Создать массив из N чисел (вводим из консоли)
//    Разбить его на 2 массива равной длины
//    Отсортировать первую половину массива по возрастанию и вывести на экран
//    вторую половину массива отсортировать в обратном порядке и тоже
//    вывести на экран
    public static void task3() {
        int n;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n % 2 == 0) {
                    break;
                } else {
                    System.out.println("enter % 2 ");
                }
            } else {
                System.out.println("wrong data. try again");
            }
        }
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));

        int middle = array.length / 2;
        int[] array1 = Arrays.copyOf(array, middle);
        int[] array2 = Arrays.copyOfRange(array, middle, array.length);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        bubbleSort(array1);
        bubbleSortReverse(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
