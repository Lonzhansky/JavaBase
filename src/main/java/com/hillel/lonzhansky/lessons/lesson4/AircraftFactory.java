package com.hillel.lonzhansky.lessons.lesson4;

/*
    Практика: Фабрика самолётов
        a. Параметры самолетов:
            String type = "Jet";
            String name = "F52";
            int firstClassPassengers = 20;
            int secondClassPassengers = 250;
        b. Фабрика выпускает три типа самолетов:
            истребители: тип + имя
            пассажирские без бизнес класса: тип + имя + кол. пассажиров 2-го
            класса
            пассажирские с бизнес классом: тип + имя + кол. пассажиров 1
            класса + кол. пассажиров 2-го класса
        c. Сделать три метода с одним названием для каждого типа самолета
            buildAirplane("Jet", "F52");
            buildAirplane("Boeing", "747", 300);
            buildAirplane("Boeing", "747", 300, 25);
        d. Каждый метод должен выводить на экран параметры сделанного самолёта

     */

public class AircraftFactory {
    public static void main(String[] args) {
        buildAirplane("Jet", "F52");
        buildAirplane("Boeing", "747", 300);
        buildAirplane("Boeing", "747", 300, 25);
    }

    public static void buildAirplane(String type, String name) {
        System.out.println("истребитель :" + type + " - " + name);
    }

    public static void buildAirplane(String type, String name, int secondClassPassengers) {
        System.out.println("пассажирские без бизнес класса : " + type + " - " + name + ", кол. пассажиров 2-го класса: " + secondClassPassengers);
    }

    public static void buildAirplane(String type, String name, int secondClassPassengers, int firstClassPassengers) {
        System.out.println(
                "пассажирские с бизнес классом : " + type + " - " + name
                + ", кол. пассажиров 1-го класса: " + firstClassPassengers
                + ", кол. пассажиров 2-го класса" + secondClassPassengers);
    }
}
