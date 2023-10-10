package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        System.out.println("2. Модифицируйте класс Jaeger.");

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Cherno Alpha");
        jaeger2.setMark("Mark-I");
        jaeger2.setOrigin("Russia");
        jaeger2.setHeight(85.34F);
        jaeger2.setWeight(2.412F);
        jaeger2.setStrength(10);
        jaeger2.setArmor(10);

        Jaeger jaeger1 = new Jaeger("Romeo Blue", "Mark-I", "USA", 77.72F, 7.775F, 7, 6);
        jaeger1.setModelName("Horizon Brave");
        jaeger1.setMark("Mark-I");
        jaeger1.setOrigin("China");
        jaeger1.setHeight(72.54F);
        jaeger1.setWeight(7.890F);
        jaeger1.setStrength(4);
        jaeger1.setArmor(6);

        System.out.println("Характеристики роботов до изменения параметров.");
        System.out.print(jaeger1);
        System.out.print(jaeger2);

        jaeger2.setModelName("Crimson Typhoon");
        jaeger2.setMark("Mark-I");
        jaeger2.setOrigin("China");
        jaeger2.setHeight(76.2F);
        jaeger2.setWeight(1.722F);
        jaeger2.setStrength(8);
        jaeger2.setArmor(6);

        System.out.println("Характеристики роботов после изменения параметров.");
        System.out.print(jaeger1);
        System.out.print(jaeger2);
    }
}