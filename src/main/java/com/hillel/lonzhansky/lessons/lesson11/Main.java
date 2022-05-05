package com.hillel.lonzhansky.lessons.lesson11;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Employee employee1 = new Employee();
        employee1.name = "Denis";
        employee1.surname = "Lonzhansky";
        employee1.age = 27;
        employee1.car = car;

        Employee employee2 = new Employee(employee1);

        System.out.println(employee1.car.carName);
        System.out.println(employee2.car.carName);

        employee1.car.carName = "Mercedes";

        System.out.println(employee1.car.carName);
        System.out.println(employee2.car.carName);










//        Employee employee2 = new Employee("Alex", "Alexov", 45);
//        Employee employee3 = new Employee("Ben", "LJIKO", 38);
//
//        Employee[] employees = new Employee[] {employee1, employee2, employee3};
//
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].age > 40) {
//                employees[i].printInfo();
//            }
//        }


//        Employee employee2 = new Employee("Denis", "Lonzhansky", 27);
//        Employee employee3 = new Employee("Denis", "Lonzhansky" );
//        Employee employee4 = new Employee("Denis");
//        Employee employee5 = new Employee();





    }



}
