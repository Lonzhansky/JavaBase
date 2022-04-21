package com.hillel.lonzhansky.lessons.lesson2;

public class MyCar {
    public static void main(String[] args) {
        String name = "Mercedes-Benz";
        String name2 = "Mercedes-Benz2";
        String name3 = "Mercedes-Benz";
        String name4 = "Mercedes-Benz";
        char category = 'B';
        byte wheels = 4;
        short passengers = 5;
        int number = 5544;
        long phone = 380934035220L;
        float price = 15_000.500F;
        double radio = 106.5;

        System.out.println("name car: " + name);
        System.out.println("category: " + category);
        System.out.println("wheels quantity: " + wheels);
        System.out.println("passengers quantity: " + passengers);
        System.out.println("number: " + number);
        System.out.println("owner phone number: " + phone);
        System.out.println("price: " + price);
        System.out.println("radio: " + radio);
    }
}
