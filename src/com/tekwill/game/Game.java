package com.tekwill.game;

import java.util.Scanner;

public class Game {

    static final int ELEMENTS_SIZE = 3;
    String[] elements = new String[ELEMENTS_SIZE];


    public Game() {
        elements[0] = "Rock";
        elements[1] = "Paper";
        elements[2] = "Scissors";
    }

    public String input() {
        String gameElement = null;
        int inputtedElement = -1;

        while (inputtedElement < 0) {
            System.out.println("To start the Game type your element: ");
            System.out.println("Rock (1)");
            System.out.println("Paper (2)");
            System.out.println("Scissors (3)");

            Scanner in = new Scanner(System.in);

            String inputValue = in.nextLine();
            try {
                inputtedElement = Integer.parseInt(inputValue);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input ");
                //in.nextLine();
            }
            if (inputtedElement == 1 ||
                    inputtedElement == 2 ||
                    inputtedElement == 3)
                gameElement = elements[inputtedElement - 1];
            else {
                inputtedElement = -1;
            }
        }
        return gameElement;
    }

    public String iiChoise() {

        double iiChoiseElement = Math.random();

        iiChoiseElement = Math.round(iiChoiseElement * 100);

        int intIiChoiseElement = (int) iiChoiseElement % 3;

        String gameElementIi = elements[intIiChoiseElement];

        return gameElementIi;
    }

    public void theGame(String gameElement, String gameElementIi) {
        if (gameElement.equals("Rock")) {
            compareToRock(gameElementIi);
        } else if (gameElement.equals("Paper")) {
            compareToPaper(gameElementIi);
        } else
            compareToScissors(gameElementIi);
    }

    public void compareToRock(String element) {
        //Comparing when our element is Rock
        if (element.equals("Scissors")) {
            System.out.println("You Win!");
        } else if (element.equals("Paper")) {
            System.out.println("You Lose!");
        } else
            System.out.println("Draw");
    }

    public void compareToPaper(String element) {
        //Comparing when our element is Rock
        if (element.equals("Rock")) {
            System.out.println("You Win!");
        } else if (element.equals("Scissors")) {
            System.out.println("You Lose!");
        } else
            System.out.println("Draw");
    }

    public void compareToScissors(String element) {
        //Comparing when our element is Rock
        if (element.equals("Paper")) {
            System.out.println("You Win!");
        } else if (element.equals("Rock")) {
            System.out.println("You Lose!");
        } else
            System.out.println("Draw");
    }
}

