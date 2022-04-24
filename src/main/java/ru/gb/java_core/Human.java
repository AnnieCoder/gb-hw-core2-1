package ru.gb.java_core;

public class Human implements Actions {

    private String name;
    private int distance, height;

    public Human(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void move() {
        System.out.println("Human walking on legs");
    }

    @Override
    public void jump() {
        System.out.println("Human jumping on legs");
    }

    @Override
    public int getDistance() {
        return this.distance;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

}
