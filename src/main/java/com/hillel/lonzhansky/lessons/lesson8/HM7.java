package com.hillel.lonzhansky.lessons.lesson8;

import java.util.Arrays;

public class HM7 {
    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        final int COUNT_PLAYERS = 30;

        int[] team1 = new int[COUNT_PLAYERS];
        int[] team2 = new int[COUNT_PLAYERS];
        int sumTeam1 = 0;
        int sumTeam2 = 0;
        int ageMin = 18;
        int ageMax = 40;

        for (int i = 0; i < COUNT_PLAYERS; i++) {
            team1[i] = ageMin + (int) (Math.random() * (ageMax + 1 - ageMin));
            team2[i] = ageMin + (int) (Math.random() * (ageMax + 1 - ageMin));

            sumTeam1 += team1[i];
            sumTeam2 +=team2[i];
        }

        System.out.println("team1 :" + Arrays.toString(team1));
        System.out.println("team2 :" + Arrays.toString(team2));
        System.out.println("avg team1 " + sumTeam1 / COUNT_PLAYERS);
        System.out.println("avg team2 " + sumTeam2 / COUNT_PLAYERS);
    }


    public static void task2() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void task3() {
        int[] source = {1, 2, 3, 4, 5};
        int[] target = {6, 7 , 8};
        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Target: " + Arrays.toString(target));
        target = arrayCopy(source, 5, 4, 3, 23);
        System.out.println("Target after arrayCopy: " + Arrays.toString(target));
    }

    public static int[] arrayCopy(int[] source, int... target) {
        int[] result = new int[source.length + target.length];
        System.arraycopy(source, 0, result, 0, source.length);
        System.arraycopy(target, 0, result, source.length, target.length);

//        for (int i = 0; i < target.length; i++) {
//            result[i] = target[i];
//        }
//        for (int i = 0; i < source.length; i++) {
//            result[i + target.length] = source[i];
//        }
        return result;
    }
}
