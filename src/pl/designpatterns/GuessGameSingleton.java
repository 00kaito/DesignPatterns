package pl.designpatterns;

import java.util.Random;
import java.util.Scanner;

class GuessGameSingleton {
    private final int THRESHOLD = 3;
    private final int RANGE = 3;
    private int score = 0;
    private int tries = 0;

    private static GuessGameSingleton instance;

    private GuessGameSingleton() {
    }

    void run() {
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

    void getScoreInfo() {
        System.out.println("You hit accurately " + THRESHOLD + " times " + " after " + tries + " attempts");
        System.out.println("Effectiveness: " + THRESHOLD * 100 / tries + "%");
    }

    static GuessGameSingleton getInstance() {
        if (instance == null) {
            synchronized (GuessGameSingleton.class) {
                if (instance == null) {
                    instance = new GuessGameSingleton();
                }
            }
        }
        return instance;
    }

    int getScore() {
        return score;
    }
}
