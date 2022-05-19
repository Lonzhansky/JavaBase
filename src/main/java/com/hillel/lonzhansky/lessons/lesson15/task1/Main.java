package com.hillel.lonzhansky.lessons.lesson15.task1;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        Iphones iphones = new Iphones();

        androids.call();
        androids.sms();
        androids.internet();
        androids.root();

        iphones.call();
        iphones.sms();
        iphones.internet();
        iphones.airdrop();
    }
}
