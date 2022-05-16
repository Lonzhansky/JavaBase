package com.hillel.lonzhansky.lessons.lesson14.homework13;

/*
    Автомат с напитками

    Используемые инструменты:
    1) enum (напитки)
    2) константы (цены)
    3) static (общая стоимость)
    4) switch (выбор напитка)
    Задание:
    #1 сделайте enum DrinksMachine, который умеет делать КОФЕ, ЧАЙ, ЛИМОНАД,
    МОХИТО, МИНЕРАЛКУ, КОКА_КОЛУ;
    #2 Сделайте класс Drinks, в котором константами задайте цену напитка;
    #3 Сделайте подсчет количества сделанных напитков и общей суммы которую должен
    заплатить клиент;
    #4 Сделайте метод для приготовления каждого напитка;
    #5 Сделайте switch-case оператор который будет делать напиток(вызывая
    соответствующий метод) в зависимости от выбора клиента;
    #6 Добавьте возможность выбора напитка для пользователя, и в зависимости от выбора
    делайте ему напиток;
    #7 Пользователь должен иметь возможность заказать несколько напитков
    #8 и в конце увидеть сколько денег он должен заплатить;

 */


import java.util.Arrays;
import java.util.Scanner;



public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int totalPrice = 0;

    public static void main(String[] args) {
        run();
        System.out.println("Total count: " + Drink.count);
        System.out.println("Total price: " + totalPrice);
        scanner.close();
    }

    private static void run() {
        System.out.println("You can buy: " + Arrays.toString(DrinksMachine.values()));

        while (true) {
            DrinksMachine drinksMachine = getDrinkType();
            if (drinksMachine == null) {
                return;
            }

            switch (drinksMachine) {
                case COFFEE -> {
                    System.out.println("You choose: " + drinksMachine.getTitle() + ", price: " + Drinks.COFFEE_PRICE);
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.COFFEE_PRICE;
                    break;
                }
                case TEA -> {
                    System.out.println("You choose: " + drinksMachine.getTitle() + ", price: " + Drinks.TEA_PRICE);
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.TEA_PRICE;
                    break;
                }
            }
        }
    }

    public static void makeCoffee() {
        System.out.println("Please take your coffee");
    }

    private static DrinksMachine getDrinkType() {
        System.out.println("Please choose drink or type \"stop\"");

        while (true) {
            String str = scanner.next().toUpperCase();

            if (str.equals("STOP")) {
                return null;
            }

            for (DrinksMachine value : DrinksMachine.values()) {
                if (str.equals(value.toString())) {
                    return DrinksMachine.valueOf(str);
                }
            }
            System.out.println("Please choose drink from list " + Arrays.toString(DrinksMachine.values()));

//            try {
//                drinksMachine = DrinksMachine.valueOf(str);
//                break;
//            } catch (IllegalArgumentException e) {
//                if (str.equals("STOP")) {
//                    return null;
//                } else {
//                    System.out.println("Please choose drink from list: " +
//                            Arrays.toString(DrinksMachine.values()));
//                }
//            }

        }
    }

}
