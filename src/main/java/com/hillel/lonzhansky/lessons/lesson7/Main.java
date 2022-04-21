package com.hillel.lonzhansky.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*int[] array = new int[10];

        //array[0] = (int) (Math.random() * 11);
        //array[1] = (int) (Math.random() * 11);

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                array[i] = 10;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();



        for (int value : array) {
            if (value == 5) {
                array[10] = 10;
            }
            System.out.println(value);
        }*/

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;
        System.out.println(Arrays.toString(array));
//        demo(array, 4, 3, 12, 2);
        demo(array);
        int[] demo = array;
        int[] demo2 = array;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(demo));


        demo2[0] = 2;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(demo));
        System.out.println(Arrays.toString(demo2));

    }

    public static void demo(int[] array, int... values) {
        array[0] = 5;
        array[4] = 10;
        int[] arr = array;
        arr[0] = 99;
        array = arr;

//        return array;
    }


//    вывести на экран в одну строку все цифры, разделив их запятой, но у
//    последнего символа не выводить запятую
    public static void task1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }

        }
    }
/*
    В убийстве Кеннеди есть 10 подозреваемых. Для каждого подозреваемого
    установлена вероятность того, что он был убийцей. Все эти вероятности
    записаны в виде массива чисел. Написать функцию, которая и определит
    номер подозреваемого, которого надо посадить в тюрьму.
*/
    public static void task2() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("index: " + index + " chance: " + max);
    }


    /*

    В вашей баскетбольной команде 10 человек. Очки игроков основного
    состава записаны в четные ячейки массива , а запасных игроков - в
    нечетных. Написать функцию, которая найдет насколько больше очков
    заработал основной состав по отношению к запасным игрокам.

     */

    public static void task3() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

        int sumTeam1 = 0;
        int sumTeam2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumTeam1 += array[i];
            } else {
                sumTeam2 += array[i];
            }
        }

        System.out.println("Team1 = " + sumTeam1);
        System.out.println("Team2 = " + sumTeam2);
       /* if (sumTeam1 > sumTeam2 ) {
            System.out.println("team 1 win");
        } else if (sumTeam1 < sumTeam2) {
            System.out.println("team 2 win");
        } else {
            System.out.println("draw");
        }*/
        System.out.println(
                sumTeam1 > sumTeam2
                ? "Team1 win"
                : sumTeam1 < sumTeam2
                    ? "team2 win"
                    : "Draw");
    }

}
