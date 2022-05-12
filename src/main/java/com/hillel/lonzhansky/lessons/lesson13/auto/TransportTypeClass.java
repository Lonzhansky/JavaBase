package com.hillel.lonzhansky.lessons.lesson13.auto;

public class TransportTypeClass {

    private String title;

    public static TransportTypeClass MOTORCYCLE2 = new TransportTypeClass();
    public static TransportTypeClass MOTORCYCLE = new TransportTypeClass("Мотоцикл");
    public static TransportTypeClass CAR = new TransportTypeClass("Автомобиль");
    public static TransportTypeClass BUS = new TransportTypeClass("Автобус");
    public static TransportTypeClass TRUCK = new TransportTypeClass("Грузовик");

    private TransportTypeClass(String title) {
        this.title = title;
    }

    private TransportTypeClass() {
    }

    @Override
    public String toString() {
        return title;
    }
}
