package ru.gb.java_core;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        actions[0] = new Human("Jack", 7, 4);
        actions[1] = new Cat("Kitty", 3, 3);
        actions[2] = new Robot("C3PO", 10, 10);

        Obstruction[] obstructions = new Obstruction[6];

        for (int i = 0; i < obstructions.length; i++) {
            int distance = rand.nextInt(15);
            boolean isWall = rand.nextBoolean();
            if (isWall) {
                obstructions[i] = new Wall("Wall " + i, distance);
            } else {
                obstructions[i] = new Treadmill("Treadmill " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstructions.length; j++) {

                result = obstructions[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }


        }
    }

}
