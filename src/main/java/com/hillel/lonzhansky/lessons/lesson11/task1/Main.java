package com.hillel.lonzhansky.lessons.lesson11.task1;

public class Main {
    public static void main(String[] args) {
//        Computer notebook = new PC(
//                "Intel Core i9-12900k",
//                "Samsung 22\"",
//                2000,
//                5,
//                "Logitech 3543543");
//
//        Computer notebook2 = new Notebook(
//                "Intel Core i9-11900k",
//                "Samsung 15\"",
//                1500,
//                1.5,
//                "Touchpad 687885");
//
        Console console = new Console("PS5",
                "Samsung 15\"",
                1500, 4, "Joystick");
        console.processor = "sgfdgs";



        Computer[] computers = getComputers();
        printInfo(computers);


    }

    public static Computer[] getComputers() {
        return new Computer[] {
                new PC(
                        "Intel Core i9-12900k",
                        "Samsung 22\"",
                        2000,
                        5,
                        "Logitech 3543543"),
                new Notebook(
                        "Intel Core i9-11900k",
                        "Samsung 15\"",
                        1500,
                        1.5,
                        "Touchpad 687885"),
                new Console("PS5",
                        "Samsung 15\"",
                        1500, 4, "Joystick")
        };
    }

    public static void printInfo(Computer[] computers) {
        for (int i = 0; i < computers.length; i++) {
            computers[i].printInfo();
        }
    }
}
