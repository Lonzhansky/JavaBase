package com.hillel.lonzhansky.lessons.lesson11;

public class Employee {
    public String name;
    String surname;
    int age;
    Car car;

    public Employee(String name, String surname, int age, Car car) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.car = new Car(car.carName);
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(Employee employee) {
        this(employee.name, employee.surname, employee.age, employee.car);
    }

    public Employee() {
    }

    public void setEmployeeFields(Employee employee, String name, String surname, int age) {
        employee.name = name;
        employee.surname = surname;
        employee.age = age;
    }

    public void setEmployeeFields2(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public void printInfo() {
        System.out.println("name='" + this.name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age);
    }
}
