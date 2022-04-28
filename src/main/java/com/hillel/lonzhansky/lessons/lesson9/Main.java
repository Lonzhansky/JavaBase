package com.hillel.lonzhansky.lessons.lesson9;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[][] array = new int[5][2];
//        int[][] array2 = {
//                {1, 2},
//                {3, 4},
//                {5, 6}
//        };
//
////        int[][][] array3 = new int[3][2][4];
//        int[][][] array3 = {
//                {
//                        {18, 28, 18, 28}, {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5}, {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19, 55}, {1, 7, 38, 11}
//                }
//        };

//        int number = 1;
//        for (int i = 0; i < array3.length; i++) {
//            for (int j = 0; j < array3[i].length; j++) {
//                for (int k = 0; k < array3[i][j].length; k++) {
//                    array3[i][j][k] = number;
//                    number++;
//                }
//            }
//        }

//        System.out.println(Arrays.toString(array3[1][1]));
//
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                for (int k = 0; k < array3[i][j].length; k++) {
//                    System.out.print(array3[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                for (int k = 0; k < array3[i][j].length; k++) {
//                    System.out.print("array[" + i + "][" + j + "][ " + k +"] = " + array3[i][j][k] + "\t");
//                }
//            }
//            System.out.println();
//        }

//        //1
//        array[0][0] = 1;
//        array[0][1] = 2;
//        array[0][2] = 3;
//
//        //2
//        array[1][0] = 4;
//        array[1][1] = 5;
//        array[1][2] = 6;
//
//        //3
//        array[2][0] = 4;
//        array[2][1] = 5;
//        array[2][2] = 6;

//        int number = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = number;
//                number++;
//            }
//        }
//
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                System.out.print(array2[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                System.out.print("array[" + i + "][" + j + "] = " + array2[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        System.out.println(Arrays.deepToString(array));

        task4();
    }
    
    public static void task1() {
        int[][] array = new int[5][5];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            array[i][j] = 1;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task2() {
        char[][] array = new char[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = 'B';
                } else {
                    array[i][j] = 'W';
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task3() {
        int[][] array = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };

        int[][] array2 = new int[2][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array[j][i];
            }
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task4() {
        int[][] array = new int[3][3];
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               array[i][j] = number;
               number++;
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


    }

}