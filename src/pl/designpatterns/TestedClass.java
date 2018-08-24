package pl.designpatterns;

class TestedClass {
    static void testSimpleSingleton() {
        GuessGameSingleton guessGame = GuessGameSingleton.getInstance();
        guessGame.run();
        guessGame.getScoreInfo();

        GuessGameSingleton tryToCreateAnotherInstance = GuessGameSingleton.getInstance();
        if (guessGame == tryToCreateAnotherInstance) {
            System.out.println("it's Singleton");
            if (guessGame.getScore() == tryToCreateAnotherInstance.getScore()) {
                System.out.println("the same score as the proof");
            }
        }
    }

    static void testTrickyEnumSingleton() {
        EnumGuessGameSingleton enumGuessGame = EnumGuessGameSingleton.INSTANCE;
        enumGuessGame.run();
        enumGuessGame.getScoreInfo();

        EnumGuessGameSingleton tryToCreateAnotherInstance = EnumGuessGameSingleton.INSTANCE;
        if (enumGuessGame == tryToCreateAnotherInstance) {
            System.out.println("it's Singleton");
            if (enumGuessGame.getScore() == tryToCreateAnotherInstance.getScore()) {
                System.out.println("the same score as the proof");
            }
        }
    }
}
