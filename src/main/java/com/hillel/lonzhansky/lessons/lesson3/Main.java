package com.hillel.lonzhansky.lessons.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        char a = 'A';
        int intA = a;
        System.out.println(intA);

        float f = intA;
        System.out.println(f);

        double d = f;
        System.out.println(d);

        long l = intA;

        d = l;
        System.out.println(d);

        byte b = (byte) a;
        System.out.println(b);

        int a11 = 2147483647;
        float b11 = a11;
        double d11 = a11;
        System.out.println(a11);
        System.out.println(b11);
        System.out.println(d11);
        System.out.println((int) b11);
        int aa = (int) b11;
        int aa2 = (int) d11;
        System.out.println(aa);
        System.out.println(aa2);

        long l1 = 999999999999999999l;
        float f2 = l1;
        float f3 = 9.9999998f;
        System.out.println(l1);
        System.out.println(f2);
        long l2 = (long) f2;
        long l3 = (long) f3;
        System.out.println(l2);
        System.out.println(l3);

//        boolean b1 = true;
//        byte bty1 = b1;

        System.out.println(10 % 7);

        float float1 = 0.1111111111111111f;
        System.out.println(float1);
        float1 = float1 + float1 + float1 + float1 + float1;
        System.out.println(float1);
        double double11 = 0.1111111111111111;
        System.out.println(double11);
        double11 = double11 + double11 + double11 + double11 + double11;
        System.out.println(double11);


        double double1 = 4.0000007;
        double double2 = 4.0000005;
        double doubleResult = double1 + double2;
        System.out.println(doubleResult);

        double d1 = 1.49;
        double d2 = 1.50;
        double d3 = 1.75;
        double d4 = -1.49;
        double d5 = -1.51;
        double d6 = -1.75;

        float f1 = 10.5f;
//        float f2 = 9f;
//        float f3 = -10;
        float f4 = -9f;


        System.out.println("d1 = " + Math.round(d1));
        System.out.println("d2 = " + Math.round(d2));
        System.out.println("d3 = " + Math.round(d3));
        System.out.println("d4 = " + Math.round(d4));
        System.out.println("d5 = " + Math.round(d5));
        System.out.println("d6 = " + Math.round(d6));
        System.out.println("-----------");
        System.out.println("f1 = " + Math.round(f1));
        System.out.println("f2 = " + Math.round(f2));
        System.out.println("f3 = " + Math.round(f3));
        System.out.println("f4 = " + Math.round(f4));

        // Возведение в квадрат числа 5
        int a2 = 5;
        int b2 = 2;
        System.out.println("Число 5 в квадрате равно " + Math.pow(a2, b2));

        // Возведение в куб числа 3
        int a4 = 3;
        int b4 = 3;
        System.out.println("Число 3 в кубе равно " + Math.pow(a4, b4));

        double x1 = 10.635;
        double y1 = 3.76;
        System.out.printf("Значение %.3f в степени %.2f равно %.3f \n", x1, y1, Math.pow(x1, y1));
        System.out.printf("pow(%s, %s) = %.3f \n\n", x1, y1, Math.pow(x1, y1));

        double x11 = 16;
        double x2 = 2.25;
        double x3 = 0.25;
        double x4 = 88.675;

        System.out.printf("sqrt(%.3f) = %.3f%n", x11, Math.sqrt(x11));
        System.out.printf("sqrt(%.3f) = %.3f%n", x2, Math.sqrt(x2));
        System.out.printf("sqrt(%.3f) = %.3f%n", x3, Math.sqrt(x3));
        System.out.printf("sqrt(%.3f) = %.3f%n", x4, Math.sqrt(x4));

        int a1 = 0; // Начальное значение диапазона - "от"
        int b1 = 10; // Конечное значение диапазона - "до"

        int random_number1 = a1 + (int) (Math.random() * b1); // Генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number1);

        int random_number2 = a1 + (int) (Math.random() * b1); // Генерация 2-го числа
        System.out.println("2-ое случайное число: " + random_number2);

        int random_number3 = a1 + (int) (Math.random() * b1); // Генерация 3-го числа
        System.out.println("3-е случайное число: " + random_number3);


        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        System.out.println(x++);
        System.out.println(x);


//        Практика:
//        a. | a - b | / ( a + b )3 - √c
        a = 2;
        b = -3;
        int c = 16;
        double result = Math.abs(a - b) / (a + b) * 3 - Math.sqrt(c);
        System.out.println(result);
        System.out.println(Math.abs(a - b));
        System.out.println(Math.abs(a - b) / (a + b));
        System.out.println(Math.abs(a - b) / (a + b) * 3);
        System.out.println(Math.abs(a - b) / (a + b) * 3 - Math.sqrt(c));

//        b. ( a + b ) / 12 * c % 4 + |b|
        double result2 = (a + b) / 12 * c % 4 + Math.abs(b);
        System.out.println(result2);
        System.out.println((a + b));
        System.out.println((a + b) / 12);
        System.out.println((a + b) / 12 * c);
        System.out.println((a + b) / 12 * c % 4);
        System.out.println((a + b) / 12 * c % 4 + Math.abs(b));

//        c. Расчет зарплаты
//        Дано: зарплаты трех работников за 1 месяц (a, b, c)
//        Рассчитать:
//        1. для каждого работника сумму зарплаты за 10 лет
//        2. вычесть 5% налог
//        3. посчитать среднее арифметическое по трем суммам за 10 лет
//        4. вывести суммы зарплат за 10 лет с учетом вычета налогов и
//        среднее арифм.
        System.out.println();
        double salary1 = 500;
        double salary2 = 1500;
        double salary3 = 3500;

        double salary1for10years = salary1 * 12 * 10;
        double salary2for10years = salary2 * 12 * 10;
        double salary3for10years = salary3 * 12 * 10;

        System.out.println(salary1for10years);
        System.out.println(salary2for10years);
        System.out.println(salary3for10years);
        System.out.println();

        double salary1WithoutTax = salary1for10years - salary1for10years * 0.05;
        double salary2WithoutTax = salary2for10years - salary2for10years * 0.05;
        double salary3WithoutTax = salary3for10years - salary3for10years * 0.05;

        System.out.println(salary1WithoutTax);
        System.out.println(salary2WithoutTax);
        System.out.println(salary3WithoutTax);
        System.out.println();

        double avg = (salary1WithoutTax + salary2WithoutTax + salary3WithoutTax) / 3;
        System.out.println(avg);
        System.out.println();

        double sum = salary1WithoutTax + salary2WithoutTax + salary3WithoutTax;
        System.out.println(sum);


//        d. Дети слепили снеговика из 3х идеальной формы шаров снега. Шары
//        получились радиусами 1м, 0.5м и 0.2м. Учитывая, что коэффициент
//        плотности снежных шаров равен 0.7кг/м3, найти сколько весит снеговик.

        // Объем шара - 4/3*pi*r^3

        double ball1 = 1;
        double ball2 = 0.5;
        double ball3 = 0.2;
        final double DENSITY_FACTOR = 0.7;

        double volumeBall1 = (double) 4 / 3 * Math.PI * Math.pow(ball1, 3);
        double volumeBall2 = (double) 4 / 3 * Math.PI * Math.pow(ball2, 3);
        double volumeBall3 = (double) 4 / 3 * Math.PI * Math.pow(ball3, 3);

        System.out.println(volumeBall1);
        System.out.println(volumeBall2);
        System.out.println(volumeBall3);

        double weightBall1 = volumeBall1 * DENSITY_FACTOR;
        double weightBall2 = volumeBall2 * DENSITY_FACTOR;
        double weightBall3 = volumeBall3 * DENSITY_FACTOR;

        System.out.println(weightBall1);
        System.out.println(weightBall2);
        System.out.println(weightBall3);

        double sumWeightBalls = weightBall1 + weightBall2 + weightBall3;
        System.out.println(sumWeightBalls);

        printGreeting();
        printGreeting();
        System.out.println(calculateSum(4, 5));
    }

    public static void printGreeting() {
        System.out.println("Hello");
    }

    public static int getAge() {
        int age = 10;
        return age;
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
