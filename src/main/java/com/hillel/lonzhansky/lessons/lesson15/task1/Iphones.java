package com.hillel.lonzhansky.lessons.lesson15.task1;

public class Iphones implements Smartphones, IOs {
    @Override
    public void call() {
        System.out.println("Iphones call");
    }

    @Override
    public void sms() {
        System.out.println("Iphones sms");
    }

    @Override
    public void internet() {
        System.out.println("Iphones internet");
    }

    @Override
    public void airdrop() {
        System.out.println("airdrop");
    }
}
