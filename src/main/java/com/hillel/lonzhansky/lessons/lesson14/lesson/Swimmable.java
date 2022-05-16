package com.hillel.lonzhansky.lessons.lesson14.lesson;

public interface Swimmable {

    int COFFE_PRICE = 2;

    void swim();

    default void swim2() {
        int a = 8;

        System.out.println("swim2");
//        somePrivateMethod();
    }

    static void someStaticMethod() {
        System.out.println("someStaticMethod");
    }

    private void somePrivateMethod() {
        System.out.println("somePrivateMethod");
    }


    void execute();

    default void execute2() {
        System.out.println("execute2 from Swimmable");
    }
}
