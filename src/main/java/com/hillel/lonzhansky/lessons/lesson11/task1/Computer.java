package com.hillel.lonzhansky.lessons.lesson11.task1;

public class Computer {

    protected String processor;
    public String monitor;
    // package-private (default)
    double price;
    private double weight;

    public Computer(String processor, String monitor, double price, double weight) {
        this.processor = processor;
        this.monitor = monitor;
        this.price = price;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println(
                "processor='" + processor + '\'' +
                        ", monitor='" + monitor + '\'' +
                        ", price=" + price +
                        ", weight=" + weight);
    }

    String getProcessor() {
        return processor;
    }

    protected void setProcessor(String processor) {
        this.processor = processor;
    }

    protected double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
