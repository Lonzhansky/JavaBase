package com.hillel.lonzhansky.lessons.lesson14.homework13;

public enum DrinksMachine {
    COFFEE("Кофе"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохито"),
    WATER("Вода"),
    COLA("Кола");

    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
