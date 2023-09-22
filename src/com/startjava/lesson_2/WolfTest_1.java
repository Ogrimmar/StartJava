package com.startjava.lesson_2;

public class WolfTest_1 {

    public static void main(String[] args) {
        Wolf_1 wolf = new Wolf_1();
        wolf.gender = "Male";
        wolf.moniker = "Razor";
        wolf.weight = 100;
        wolf.age = 10;
        wolf.colour = "Gray";

        System.out.print("Пол волка: " + wolf.gender + "\n" +
                "Кличка волка: " + wolf.moniker + "\n" +
                "Вес волка: " + wolf.weight + "\n" +
                "Возраст волка: " + wolf.age + "\n" +
                "Цвет волка: " + wolf.colour + "\n");

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}