package com.hillel.lonzhansky.lessons.lesson4;

/*
    Практика: Зоопарк
        a. В зоопарке живут звери (каждого вида минимум 2, максимум 30):
            мишки
            тигры
            попугаи
            слоны
            еноты
        b. известно, что количество зверей увеличивается каждый год на
        определенный коэффициент:
            мишки на 30%
            тигры на 20%
            попугаи на 40%
            слоны на 5%
            еноты на 80%
        c. Задание:
            посчитать c помощью метода countAnimals() - сколько зверей в
            зоопарке в этом году;
            с помощью метода countAnimalsNextYear() посчитать - сколько их
            будет через год, учитывая коэффициенты;
            сделать такой же метод но с количеством зверей 6
     */

public class Zoo {

    public static final double COEFFICIENT_BEARS = 1.3;
    public static final double COEFFICIENT_TIGERS = 1.2;
    public static final double COEFFICIENT_PARROTS = 1.4;
    public static final double COEFFICIENT_ELEPHANTS = 1.05;
    public static final double COEFFICIENT_RACCOONS = 1.8;
    public static final double COEFFICIENT_LIONS = 1.6;

    public static void main(String[] args) {

        int min = 2;
        int max = 30;

        int bears = getRandomNumber(min, max);
        int tigers = getRandomNumber(min, max);
        int parrots = getRandomNumber(min, max);
        int elephants = getRandomNumber(min, max);
        int raccoons = getRandomNumber(min, max);
        int lions = getRandomNumber(min, max);

        System.out.println("bears = " + bears);
        System.out.println("tigers = " + tigers);
        System.out.println("parrots = " + parrots);
        System.out.println("elephants = " + elephants);
        System.out.println("raccoons = " + raccoons);
        System.out.println("lions = " + lions);

        int countAnimals = countAnimals(bears, tigers, parrots, elephants, raccoons, lions);
        System.out.println("count animals = " + countAnimals);

        int countAnimalsNextYear = countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons, lions, 10);
        System.out.println("count animals next year = " + countAnimalsNextYear);
    }

    public static int getRandomNumber(int min, int max) {
        int result = (int) (Math.random() * (max - min)) + min;
        return result;
    }

    public static int countAnimals(int bears, int tigers, int parrots, int elephants, int raccoons) {
        int result = bears + tigers + parrots + elephants + raccoons;
        return result;
    }

    public static int countAnimals(int bears, int tigers, int parrots, int elephants, int raccoons, int lions) {
//        int result = countAnimals(bears, tigers, parrots, elephants, raccoons) + lions;
        return countAnimals(bears, tigers, parrots, elephants, raccoons) + lions;
    }

    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons) {
        int result = (int) (bears * COEFFICIENT_BEARS)
                + (int) (tigers * COEFFICIENT_TIGERS)
                + (int) (parrots * COEFFICIENT_PARROTS)
                + (int) (elephants * COEFFICIENT_ELEPHANTS)
                + (int) (raccoons * COEFFICIENT_RACCOONS);
        return result;
    }

    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons, int lions) {
//        int result = (int) (bears * COEFFICIENT_BEARS)
//                + (int) (tigers * COEFFICIENT_TIGERS)
//                + (int) (parrots * COEFFICIENT_PARROTS)
//                + (int) (elephants * COEFFICIENT_ELEPHANTS)
//                + (int) (raccoons * COEFFICIENT_RACCOONS)
//                + (int) (lions * COEFFICIENT_LIONS);
//        int result = countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons) + (int) (lions * COEFFICIENT_LIONS);
        return countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons) + (int) (lions * COEFFICIENT_LIONS);
    }

    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons, int lions, int someAnimal) {
        return countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons, lions) + (int) (someAnimal * COEFFICIENT_LIONS);
    }
}
