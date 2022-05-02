package com.hillel.lonzhansky.lessons.lesson10;

import java.lang.annotation.Annotation;
import java.util.Iterator;

public class ColorBox extends Box {
    String color;

//    public ColorBox(String someString) {
//        color = someString;
//    }

    public void printColor() {
        System.out.println("color : " + color);
    }

    public void setColor(String someColor) {
        this.color = someColor;
//        "red" = "red";
    }


    @Override
    public String toString() {
        return "ColorBox{" +
                "h=" + this.h +
                ", color='" + this.color + '\'' +
                '}';
    }
}
