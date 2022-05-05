package com.hillel.lonzhansky.lessons.lesson11.task1;

public class PC extends Computer {
    String mouse;

    public PC(String processor, String monitor, double price, double weight, String mouse) {
        super(processor, monitor, price, weight);
        this.mouse = mouse;
    }

    @Override
    public void printInfo() {
        System.out.println(
                "processor='" + processor + '\'' +
                        ", monitor='" + monitor + '\'' +
                        ", price=" + price +
                        ", weight=" + getWeight() +
                        ", mouse='" + mouse);
    }
}
