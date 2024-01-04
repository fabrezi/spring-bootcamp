package pkg3;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        Instrument[] instruments = new Instrument[10];

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = rand.nextInt((3 - 1) + 1) + 1;

            if (randomNum == 1)
                instruments[i] = new piano();
            else if (randomNum == 2)
                instruments[i] = new flute();
            else if (randomNum == 3)
                instruments[i] = new guitar();

            instruments[i].play();
        }

        for (int i = 0; i < 10; i++) {
            if (instruments[i] instanceof piano)
                System.out.println("Piano is stored at index " + i);
            else if (instruments[i] instanceof flute)
                System.out.println("Flute is stored at index " + i);
            else if (instruments[i] instanceof guitar)
                System.out.println("Guitar is stored at index " + i);
        }

    }
    }

