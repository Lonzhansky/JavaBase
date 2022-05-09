package com.hillel.lonzhansky.lessons.lesson12;

public class Burgers {
    private boolean bun;
    private int meat;
    private boolean cheese;
    private boolean greenery;
    private String mayonnaise;

    public Burgers(boolean bun, int meat, boolean cheese, boolean greenery, String mayonnaise) {
        this.bun = bun;
//        if (meat) {
//            this.meat = 1;
//        } else {
//            this.meat = 2;
//        }
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        printInfo();
    }


    public Burgers(boolean bun, int meat, boolean cheese, boolean greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        printInfo();
    }

    public Burgers(boolean bun, boolean cheese, boolean greenery) {
        this.bun = bun;
        this.meat = 2;
        this.cheese = cheese;
        this.greenery = greenery;
        printInfo();
    }

    public void setBun(boolean bun) {
        this.bun = bun;
    }

    private void printInfo() {
        System.out.println("Burgers{" +
                "bun=" + bun +
                ", meat=" + meat +
                ", cheese=" + cheese +
                ", greenery=" + greenery +
                ", mayonnaise=" + mayonnaise +
                '}');
    }
}
