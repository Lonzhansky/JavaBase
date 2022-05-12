package com.hillel.lonzhansky.lessons.lesson13;

import com.hillel.lonzhansky.lessons.lesson13.auto.TransportType;

public class Main {
    int aa = 1;

    public static void main(String[] args) {

//        GoPro goPro = new GoPro();
//        GoPro.count = 10;
//        System.out.println("main");
//        System.out.println(GoPro.count);
//
//        GoPro.someMethod();
//
//        Math.PI;

//        GoPro goPro = new GoPro();
//        GoPro goPro2 = new GoPro();
//        GoPro goPro3 = new GoPro();
//
//        goPro.setA(10);
//        goPro.model = "Model1";
//        System.out.println("goPro1 :" + goPro.getA() + " " + goPro.model);
//
//        goPro2.setA(20);
//        goPro2.model = "Model2";
//        System.out.println("goPro2 :" + goPro2.getA() + " " + goPro2.model);
//
//        goPro3.setA(30);
//        System.out.println("goPro3 :" + goPro3.getA() + " " + goPro3.model);
//
//        System.out.println("goPro1 :" + goPro.getA() + " " + goPro.model);
//
//        System.out.println(GoPro.model);
//
//        GoPro goPro4 = new GoPro();
//        System.out.println(goPro4.model);
//
//        System.out.println("count = " + goPro4.count);
//        System.out.println("count = " + goPro2.count);
//        System.out.println("count = " + goPro.count);
//        System.out.println("count = " + GoPro.count);

//
//        GoPro goPro = new GoPro10();
//        GoPro10 goPro2 = new GoPro10();
//        goPro.someMethod();
//        goPro2.someMethod();
//
//        GoPro.someMethod();
//        GoPro10.someMethod();

//        System.out.println(TransportType.BUS);
//        System.out.println(TransportType.CAR);
//        System.out.println(TransportType.MOTORCYCLE);


        GoPro goPro = new GoPro();
        goPro.setA(10);

        GoPro goPro2 = goPro.clone();
        System.out.println(goPro2.getA());

    }
}
