package com.startjava.lesson_2;

class Player {

    private String name;
    private int number;

    Player(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int _number) {
        number = _number;
    }
}