package com.startjava.lesson_2;

public class WolfTest_2 {

    public static void main(String[] args) {
        Wolf_2 wolf = new Wolf_2();
        wolf.setGender("Male");
        wolf.setMoniker("Razor");
        wolf.setWeight(100);
        wolf.setAge(10);
        wolf.setColour("Gray");

        System.out.printf("Пол волка: %s\nКличка волка: %s\nВес волка: %d\nВозраст волка: %d\nЦвет волка: %s\n", 
                wolf.getGender(), wolf.getMoniker(), wolf.getWeight(), wolf.getAge(), wolf.getColour());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}