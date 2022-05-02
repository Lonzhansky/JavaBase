package com.hillel.lonzhansky.lessons.lesson10;

import java.util.Optional;
import java.util.Scanner;

public class HM9 {
    public static void main(String[] args) {
        game();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int m = getNumber(scanner);
        int n = getNumber(scanner);

        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array2[j][i] = array1[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getNumber(Scanner scanner) {
        while (true) {
            System.out.println("input number from 1 to 9");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 1 && number <= 9) {
                    return number;
                }
            } else {
                scanner.next();
            }
        }
    }

    //____________________________

    public static void game() {
        int[][] field = new int[3][3];
        boolean playerX = true;
        do {
            printField(field);

            if (playerX) {
                System.out.println("Игрок X делает ход");
            } else {
                System.out.println("Игрок O делает ход");
            }

            Scanner scanner = new Scanner(System.in);
            int number;
            do {
                System.out.println("Введите номер пустой ячейки от 1 до 9");
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    if (isEmpty(field, number)) {
                        break;
                    }
                } else {
                    scanner.next();
                }
            } while (true);

            switch (number) {
                case 1 -> field[0][0] = playerX ? 1 : 2;
                case 2 -> field[0][1] = playerX ? 1 : 2;
                case 3 -> field[0][2] = playerX ? 1 : 2;
                case 4 -> field[1][0] = playerX ? 1 : 2;
                case 5 -> field[1][1] = playerX ? 1 : 2;
                case 6 -> field[1][2] = playerX ? 1 : 2;
                case 7 -> field[2][0] = playerX ? 1 : 2;
                case 8 -> field[2][1] = playerX ? 1 : 2;
                case 9 -> field[2][2] = playerX ? 1 : 2;
            }

            if (checkWin(field)) {
                System.out.println();
                printField(field);
                if (playerX) {
                    System.out.println("Игрок X выиграл!");
                } else {
                    System.out.println("Игрок O выиграл!");
                }
                break;
            }
            if (!isHaveEmptyCell(field)) {
                printField(field);
                System.out.println("Ничья!");
                break;
            }
            playerX = !playerX;
        } while (true);

        if (restart() == 1) {
            game();
        } else {
            System.out.println("Пока!");
        }

    }

    public static int restart() {
        Scanner scan = new Scanner(System.in);
        int restart;
        while (true) {
            System.out.println("\nХочешь сыграть еще раз? 1 - да, 2 - нет");
            if (scan.hasNextInt()) {
                restart = scan.nextInt();
                if (restart == 1 || restart == 2) {
                    return restart;
                }
            } else {
                scan.next();
            }
        }
    }

    public static void printField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 0) System.out.print("\t" + ((field.length * i) + j + 1) + "\t");
                if (field[i][j] == 1) System.out.print("\tX\t");
                if (field[i][j] == 2) System.out.print("\tO\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isEmpty(int[][] field, int number) {
        switch (number) {
//            case 1 : {
//                return field[0][0] == 0;
//            }
            case 1 -> {
                return field[0][0] == 0;
            }
            case 2 -> {
                return field[0][1] == 0;
            }
            case 3 -> {
                return field[0][2] == 0;
            }
            case 4 -> {
                return field[1][0] == 0;
            }
            case 5 -> {
                return field[1][1] == 0;
            }
            case 6 -> {
                return field[1][2] == 0;
            }
            case 7 -> {
                return field[2][0] == 0;
            }
            case 8 -> {
                return field[2][1] == 0;
            }
            case 9 -> {
                return field[2][2] == 0;
            }
            default -> {
                return false;
            }
        }
    }

    public static boolean checkWin(int[][] field) {
//        return (field[0][0] != 0 && field[0][0] == field[0][1] && field[0][0] == field[0][2]) ||
//                (field[1][0] != 0 && field[1][0] == field[1][1] && field[1][0] == field[1][2]) ||
//                (field[2][0] != 0 && field[2][0] == field[2][1] && field[2][0] == field[2][2]) ||
//                (field[0][0] != 0 && field[0][0] == field[1][0] && field[0][0] == field[2][0]) ||
//                (field[0][1] != 0 && field[0][1] == field[1][1] && field[0][1] == field[2][1]) ||
//                (field[0][2] != 0 && field[0][2] == field[1][2] && field[0][2] == field[2][2]) ||
//                (field[0][0] != 0 && field[0][0] == field[1][1] && field[0][0] == field[2][2]) ||
//                (field[0][2] != 0 && field[0][2] == field[1][1] && field[0][2] == field[2][0]);

        boolean isWin;
        isWin = field[1][1] != 0 && (field[0][0] == field[1][1] && field[0][0] == field[2][2] ||
                field[2][0] == field[1][1] && field[2][0] == field[0][2]);
        if (!isWin) {
            for (int i = 0; i < field.length; i++) {
                if ((field[i][0] != 0 && field[i][0] == field[i][1] && field[i][0] == field[i][2]) ||
                        (field[0][i] != 0 && field[0][i] == field[1][i] && field[0][i] == field[2][i])) {
                    isWin = true;
                    break;
                }
            }
        }
        return isWin;
    }

    public static boolean isHaveEmptyCell(int[][] array) {
        boolean isDraw = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    isDraw = true;
                }
            }
        }
        return isDraw;
    }

}
