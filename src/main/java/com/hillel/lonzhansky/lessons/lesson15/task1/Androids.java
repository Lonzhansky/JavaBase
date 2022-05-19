package com.hillel.lonzhansky.lessons.lesson15.task1;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Androids internet");
    }

    @Override
    public void sms() {
        System.out.println("Androids internet");
    }

    @Override
    public void internet() {
        System.out.println("Androids internet");
    }

    @Override
    public void root() {
        System.out.println("root");
    }
}
