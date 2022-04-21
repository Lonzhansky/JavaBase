package com.hillel.lonzhansky.lessons.lesson2;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 3;

        byte byteMin = (byte) -2000000;         // -128 -> 127  // -130 -> 126
        System.out.println(byteMin);


        int intVariable = 200;
        byte byteVarieble = (byte) intVariable;
        System.out.println(byteVarieble);
        int newIntVariable = byteVarieble;
        System.out.println(newIntVariable);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
