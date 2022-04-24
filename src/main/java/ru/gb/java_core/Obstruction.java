package ru.gb.java_core;

public abstract class Obstruction {

    private String name;

    public Obstruction(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Actions actions);

}
