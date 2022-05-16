package com.hillel.lonzhansky.lessons.lesson14.lesson;

public abstract class RunnableClass {

    public void runFromClass() {
        System.out.println("Run from RunnableClass");
    }

    public final void cantOverride() {
        System.out.println("Run from RunnableClass");
    }

    public abstract void execute();

    public abstract void someAbstractMethod();
}
