package com.startjava.lesson_2_3.animal;

public class Wolf_2 {

    private String gender;
    private String nickname;
    private int weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMoniker() {
        return nickname;
    }

    public void setMoniker(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return color;
    }

    public void setColour(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("Идёт.");
    }

    public void sit() {
        System.out.println("Сидит.");
    }

    public void run() {
        System.out.println("Бежит.");
    }

    public void howl() {
        System.out.println("Воет.");
    }

    public void hunt() {
        System.out.println("Охотится.");
    }
}