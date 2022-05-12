package com.hillel.lonzhansky.lessons.lesson13;

public class MyArray {
    public double getAverage(int[][] array) {
        double sum = 0;
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                amount++;
            }
        }

        return sum / amount;
    }

    public boolean isSquare(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                return false;
            }
        }
        return true;
    }

    public boolean isSquare2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length == array[i].length) {
                return true;
            }
        }
        return false;
    }

}
