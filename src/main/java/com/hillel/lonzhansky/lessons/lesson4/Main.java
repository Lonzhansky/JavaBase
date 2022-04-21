package com.hillel.lonzhansky.lessons.lesson4;

public class Main {

    public static void main(String[] args) {
//        double result = division();
//        System.out.println(result);

//        System.out.println(division());

//        int a = getA();
//        int b = getB();
//        calculate(a, b);

        int age = 10;
        System.out.println(age);
        System.out.println(getAge(10, 2));
        System.out.println(age);

        String name = "Den";
        System.out.println(name);
        System.out.println(name);

        recursion(0);

        double result = division();
        System.out.println(division());

        System.out.println("result = " + (division() + 3));
    }

    public static int getAge(int age) {
        age = 20;
        return age;
    }

    public static int getAge() {
        int age = 20;
        return age;
    }

    public static int getAge(int age, int b) {
        age = 20;
        return age;
    }

    public static int getAge(int age, double b) {
        age = 20;
        return age;
    }

    public static int getAge(double b, int age) {
        age = 20;
        return age;
    }

    public static double division() {
        int a = 10;
        int b = 3;

        double result = (double) a / b;
        result++;

        result = result / 4;
        return a / b;
    }

    public static int getA() {
        return getB();
    }

    public static int getB() {
        return 10;
    }

    public static int calculate(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void recursion(int iterator) {
        iterator++;
        System.out.println("Stacsdefrdesawerwerwer hewiurhgweui rghiweugrhiwegrweiu " +
                "griwuriweuyg riwerwerwer hewiurhgweui rghiweugrhiwegrweiu " +
                "griwuriweuyg riwerwerwer hewiurhgweui rghiweugrhiwegrweiu " +
                "griwuriweuyg riwerwerwer hewiurhgweui rghiweugrhiwegrweiu " +
                "griwuriweuyg riwegrk start (iterator) = " + iterator);
        if (true) {
            recursion(iterator);
        }
        System.out.println("Stack end (iterator) = " + iterator);
    }

}
