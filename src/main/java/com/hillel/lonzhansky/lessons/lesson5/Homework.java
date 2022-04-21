package com.hillel.lonzhansky.lessons.lesson5;

public class Homework {
    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int horsmanLi = 46;

        double allPowerLi = warriorLi * 860 + archerLi * 860 + horsmanLi * 860;
        double allPowerLi2 = (warriorLi + archerLi + horsmanLi) * 860;

        division();
    }

    public static void division() {
        int a = 10;
        int b = 3;

        double result = a / (double) b;
        System.out.println(result);
    }
}
