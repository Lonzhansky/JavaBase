package com.hillel.lonzhansky.lessons.lesson13;

import com.hillel.lonzhansky.lessons.lesson13.auto.DriverLicense;

public class GoPro implements Cloneable {
    static int count;
    private int a;
    public static String model = "asdf";


    public static final double PI = 4.13;

    public GoPro() {
        count++;
    }

    public static void someMethod() {
//        count++;
        System.out.println("superclass");
    }

    public void someMethod2() {
//        count++;
        System.out.println("someMethod");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public GoPro clone() {
        GoPro goPro = new GoPro();
        goPro.setA(this.a);
        return goPro;
    }
}
