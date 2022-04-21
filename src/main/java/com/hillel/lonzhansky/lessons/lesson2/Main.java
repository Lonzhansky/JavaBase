package com.hillel.lonzhansky.lessons.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte byteMin = (byte) -129;
        byte byteMax = 127;

        System.out.println(byteMin);
        System.out.println(byteMax);

        short shortMin = -32768;

        int someInt = 1_000_000_000;

        long someLong = 2323233232l;


        float floatUsd = 33.5534543243F;

        double doubleUsd = 33.5534543243;

        System.out.println(floatUsd);
        System.out.println(doubleUsd);


        char charVariant1 = 'A';
        char charVariant2 = 65;
        char charVariant3 = '\u0041';

        System.out.println(charVariant1);
        System.out.println(charVariant2);
        System.out.println(charVariant3);


        String someString = "Hello world srihjso" +
                "pwijht oiw toirtoirteriteirter er to" +
                "rei to igjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
                "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjretoir";

        String someString2 = """
                ghj
                Hello world srihjso


                   wijht oiw toirtoirteriteirter er to
                rei to ig  jjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
                jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjret  oir
                """;
        System.out.println(someString2);


        byte byteMin2;  // 0
        Byte byteRef = null;   // null
        Byte byteRef2 = 0;
        System.out.println(Byte.valueOf("123"));

        byte byteFromString = Byte.valueOf("123");
        System.out.println(byteFromString);


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(10 + a);

    }
}
