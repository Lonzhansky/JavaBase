package com.hillel.lonzhansky.lessons.lesson14.lesson;

public class Human extends RunnableClass implements Swimmable, Runnable {

//    @Override
//    public void cantOverride() {
//        System.out.println("Run from RunnableClass");
//    }

    @Override
    public void runFromClass() {
        System.out.println("Run from RunnableClass");
    }

    @Override
    public void swim() {
        System.out.println("Human swim");
        somePrivateMethod();
    }

//    @Override
//    public void swim2() {
//        System.out.println("swim2");
//    }

    static void someStaticMethod() {
        System.out.println("Human someStaticMethod");
    }

    private void somePrivateMethod() {
        System.out.println("Human somePrivateMethod");
    }

    @Override
    public void execute() {
        System.out.println("execute Humna");
    }

    @Override
    public void someAbstractMethod() {

    }

//    @Override
//    public void execute2() {
////        System.out.println("my execute");
//        Swimmable.super.execute2();
//        Runnable.super.execute2();
//    }

    @Override
    public void run() {
        System.out.println("Human run");
    }
}
