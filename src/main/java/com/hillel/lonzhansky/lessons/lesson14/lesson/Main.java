package com.hillel.lonzhansky.lessons.lesson14.lesson;

public class Main {
    public static void main(String[] args) {
        Swimmable.someStaticMethod();

        Human human = new Human();

        human.execute2();


        Human.someStaticMethod();

        Swimmable[] array = new Swimmable[] {
                new Cat(), new Dog(), new Human()
        };

        for (Swimmable swimable : array) {
//            swimable.swim();
            swimable.swim2();
        }




        Swimmable swimmable = new Human();
        swimmable.swim();

        Runnable runnable = new Human();


        Swimmable swimmable1 = new Swimmable() {
            @Override
            public void swim() {
                System.out.println("swim 1");
            }

            @Override
            public void execute() {
                System.out.println("execute 1");
            }
        };

        swimmable1.swim();

        Runnable runnable1 = () -> System.out.println("RUN"); // lambda java 8


    }
}
