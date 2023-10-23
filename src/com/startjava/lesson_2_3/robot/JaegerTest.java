package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        System.out.println("2. Модифицируйте класс Jaeger.");

        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Cherno Alpha");
        jaeger1.setMark("Mark-I");
        jaeger1.setOrigin("Russia");
        jaeger1.setHeight(85.34F);
        jaeger1.setWeight(2.412F);
        jaeger1.setStrength(10);
        jaeger1.setArmor(10);

        Jaeger jaeger2 = new Jaeger("Romeo Blue", "Mark-I", "USA", 77.72F, 7.775F, 7, 6);
        jaeger2.setModelName("Horizon Brave");
        jaeger2.setMark("Mark-I");
        jaeger2.setOrigin("China");
        jaeger2.setHeight(72.54F);
        jaeger2.setWeight(7.890F);
        jaeger2.setStrength(4);
        jaeger2.setArmor(6);

        System.out.println("Характеристики роботов до изменения параметров:");
        System.out.print(jaeger1);
        System.out.print(jaeger2);

        jaeger1.setModelName("Crimson Typhoon");
        jaeger1.setMark("Mark-I");
        jaeger1.setOrigin("China");
        jaeger1.setHeight(76.2F);
        jaeger1.setWeight(1.722F);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);

        System.out.println("Характеристики роботов после изменения параметров:");
        System.out.print(jaeger1);
        System.out.print(jaeger2);
    }
}