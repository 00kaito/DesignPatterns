package pl.designpatterns;

import java.util.Random;
import java.util.Scanner;

//hacky singleton
public enum EnumGuessGameSingleton {
    INSTANCE;

    private final int THRESHOLD = 3;
    private final int RANGE = 2;
    private int score = 0;
    private int tries = 0;

    //always private
    EnumGuessGameSingleton(){}

    public void run() {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        while (score < THRESHOLD) {
            int val = rand.nextInt(RANGE) + 1;
            System.out.println("Enter a number 1 - " + RANGE + ":");
            int x = reader.nextInt();
            tries++;
            if (x == val) {
                this.score++;
                System.out.println(" - yup");
            } else {
                System.out.println("- nope");
            }
        }
    }
    public void getScoreInfo() {
        System.out.println("You hit accurately " + THRESHOLD + " times " + " after " + tries + " attempts");
        System.out.println("Effectiveness: " + THRESHOLD * 100 / tries + "%");
    }

    public int getScore() {
        return score;
    }


}
