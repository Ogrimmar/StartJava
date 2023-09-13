package com.startjava.lesson_2;

public class WolfTest_1 {

    public static void main(String[] args) {
        Wolf_1 wolf = new Wolf_1();
        wolf.gender = "Male";
        wolf.moniker = "Razor";
        wolf.weight = 100;
        wolf.age = 10;
        wolf.colour = "Gray";

        System.out.printf("Пол волка: %s\nКличка волка: %s\nВес волка: %d\nВозраст волка: %d\nЦвет волка: %s\n", 
                wolf.gender, wolf.moniker, wolf.weight, wolf.age, wolf.colour);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}