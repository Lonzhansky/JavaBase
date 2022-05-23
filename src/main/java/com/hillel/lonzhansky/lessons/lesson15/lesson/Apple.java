package com.hillel.lonzhansky.lessons.lesson15.lesson;

public class Apple {

    int posX;
    int posY;

    public Apple(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void setRandomPosition() {
        posX = Math.abs((int) (Math.random() * SnakeMain.WIDTH - 1));
        posY = Math.abs((int) (Math.random() * SnakeMain.HEIGHT - 1));
    }
}
