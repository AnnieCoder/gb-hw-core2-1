package ru.gb.java_core;

public class Cat implements Actions {

    private String name;
    private int distance, height;

    public Cat(String name, int distance, int height) {
       this.name = name;
       this.distance = distance;
       this.height = height;
    }

    @Override
    public void move() {
        System.out.println("Cat walking on paws");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumping on paws");
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
