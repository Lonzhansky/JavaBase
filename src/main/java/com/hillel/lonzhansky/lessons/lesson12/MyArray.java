package com.hillel.lonzhansky.lessons.lesson12;

public class MyArray {

    int[] array = new int[] {1, 2, 3, 4};

    public int findElement(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

}
