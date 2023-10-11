package com.startjava.lesson_2_3.robot;

class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public Jaeger() {

    }

    public Jaeger(String _modelName, String _mark, String _origin, float _height, float _weight, int _strength, int _armor) {
        modelName = _modelName;
        mark = _mark;
        origin = _origin;
        height = _height;
        weight = _weight;
        strength = _strength;
        armor = _armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String _modelName) {
        modelName = _modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String _mark) {
        mark = _mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String _origin) {
        origin = _origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float _height) {
        height = _height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float _weight) {
        weight = _weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int _strength) {
        strength = _strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int _armor) {
        armor = _armor;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }

    public String toString() {
        return "Model Name: " + modelName + 
                "\nMark: " + mark + 
                "\nOrigin: " + origin + 
                "\nHeight: " + height + 
                "\nWeight: " + weight + 
                "\nStrength: " + strength + 
                "\nArmor: " + armor + "\n"; 
    }
}