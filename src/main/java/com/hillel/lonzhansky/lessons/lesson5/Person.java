package com.hillel.lonzhansky.lessons.lesson5;

public class Person {
    public static void main(String[] args) {
        String result1 = personInfo("Will", "Smith", "New York", "2936729462846");
        System.out.println(result1);
    }

    public static String personInfo(String name, String surname, String city, String phoneNumber) {
//        String result = "Позвонить гражданину + " + name + " " + surname + "  из города  " + city + " можно по номеру " + phoneNumber;
        return "Позвонить гражданину + " + name + " " + surname + "  из города  " + city + " можно по номеру " + phoneNumber;
    }


}
