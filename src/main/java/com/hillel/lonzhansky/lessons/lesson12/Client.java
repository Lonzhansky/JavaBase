package com.hillel.lonzhansky.lessons.lesson12;

public class Client {

    private final String name;
    private final String phone;
    private final String birthday;
    private final String mail;

    public String surname;
    public double weight;

    final Burgers burgers = new Burgers(true, 1, true, false);

    private final int age;

    public Client(String name, String phone, String birthday, String mail, String surname, double weight, int year) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.mail = mail;
        this.surname = surname;
        this.weight = weight;
        this.age = 2022 - year;
    }

    public Client(String name, String phone, String birthday, String mail, String surname, int year) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.mail = mail;
        this.surname = surname;
        this.weight = weight;
        this.age = 2022 - year;
    }

    public Client(String name, String phone, String birthday, int year) {
        this(name, phone, birthday, "mail@gmail.com", "lonzhansky", 76, year);
    }

    public Client(String name, String phone, String birthday, String mail,int year) {
        this(name, phone, birthday, mail, "lonzhansky", 76, year);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

//    public String getMail() {
//        return mail;
//    }


    public Burgers getBurgers() {
        return burgers;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printAccountInfo() {
        System.out.println(
                this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
//                ", mail='" + mail + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}');
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                ", mail='" + mail + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
