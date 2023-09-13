package com.startjava.lesson_2;

public class Wolf_2 {

    private String gender;
    private String moniker;
    private int weight;
    private int age;
    private String colour;

    public String getGender() {
        return gender;
    }

    public void setGender(String _gender) {
        gender = _gender;
    }

    public String getMoniker() {
        return moniker;
    }

    public void setMoniker(String _moniker) {
        moniker = _moniker;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int _weight) {
        weight = _weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int _age) {
        age = _age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String _colour) {
        colour = _colour;
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