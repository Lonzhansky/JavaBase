package com.hillel.lonzhansky.lessons.lesson11.task1;

public class Notebook extends Computer {

    String touchpad;

    public Notebook(String processor, String monitor, double price, double weight, String touchpad) {
        super(processor, monitor, price, weight);
        this.touchpad = touchpad;
    }

    public Notebook(Notebook notebook) {
        this(notebook.processor, notebook.monitor, notebook.price, notebook.getWeight(), notebook.touchpad);
    }

//    public void printInfo() {
//        System.out.println(
//                "processor='" + processor + '\'' +
//                        ", monitor='" + monitor + '\'' +
//                        ", price=" + price +
//                        ", weight=" + weight +
//                        ", touchpad='" + touchpad);
//    }
}
