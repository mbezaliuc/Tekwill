package com.tekwill.game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        String yourInput = game.input();

        String computersInput = game.iiChoise();
        System.out.println("Yours:" + yourInput + " Computer: " + computersInput);
        game.theGame(yourInput, computersInput);

    }
}
