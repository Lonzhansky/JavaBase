package com.hillel.lonzhansky.lessons.lesson13.auto;

import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        run();
        System.out.println("count license = " + DriverLicense.count);

    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);

        TransportType transportType = null;

        boolean stop = false;
        while (!stop) {
            while (!stop) {
                String str;
                System.out.println("Введите тип транспортного средства");
                str = scanner.next();
                try {
                    transportType = TransportType.valueOf(str);
                    break;
                } catch (IllegalArgumentException e) {
                    stop = str.equals("no");
                }
            }

            if (stop) {
                break;
            }

            int years;
            while (!stop) {
                System.out.println("Введите количество лет стажа");
                if (scanner.hasNextInt()) {
                    years = scanner.nextInt();
                    boolean ok = false;
                    switch (transportType) {
                        case MOTORCYCLE:
                            System.out.println(
                                    "Для вождения " + transportType.getTitle()
                                            + " необходима категория " + TransportCategory.A);
                            ok = checkYears(years, transportType);
                            break;
                        case CAR:
                            System.out.println(
                                    "Для вождения " + transportType.getTitle()
                                            + " необходима категория " + TransportCategory.B);
                            ok = checkYears(years, transportType);
                            break;
                        case BUS:
                            System.out.println(
                                    "Для вождения " + transportType.getTitle()
                                            + " необходима категория " + TransportCategory.D);
                            ok =  checkYears(years, transportType);
                            break;
                        case TRUCK:
                            System.out.println(
                                    "Для вождения " + transportType.getTitle()
                                            + " необходима категория " + TransportCategory.C);
                            ok =  checkYears(years, transportType);
                            break;
                    }
                    if (ok) {
                        System.out.println("Права выданы");
                        new DriverLicense();
                    } else {
                        System.out.println("Недостаточно стажа");
                    }
                    break;
                } else {
                    stop = scanner.next().equals("no");
                }
            }
        }
    }

    private static boolean checkYears(int years, TransportType transportType) {
        switch (transportType) {
            case MOTORCYCLE:
                return years > 3;
            case CAR:
                return years > 0;
            case BUS:
                return years > 7;
            case TRUCK:
                return years > 5;
            default:
                return false;
        }

    }
}
