package com.hillel.lonzhansky.lessons.lesson11.task1;

public class Console extends Computer {
    String joystick;

    public Console(String processor, String monitor, double price, double weight, String joystick) {
        super(processor, monitor, price, weight);
        this.joystick = joystick;
        processor = "ergffer";
    }

    @Override
    public void printInfo() {
        System.out.println(
                "processor='" + processor + '\'' +
                ", monitor='" + monitor + '\'' +
                ", price=" + price +
                ", weight=" + getWeight() +
                ", joystick='" + joystick);
    }

    public void someMethod() {

    }
}
