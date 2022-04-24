package ru.gb.java_core;

public class Treadmill extends Obstruction {

    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {

        actions.move();

        if (getLength() <= actions.getDistance()) {
            System.out.println("move success");

            return true;
        } else {
            System.out.println("move unsuccessfully");

            return false;
        }
    }

}
