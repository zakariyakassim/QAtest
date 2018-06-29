package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    Scanner input = new Scanner(System.in);

    public void StartGame(){

        boolean isGameOn = true;

        Player player1 = new PlayerInfo("Zak","16");
        Player player2 = new PlayerInfo("Jim","17");
        Alligator alligator = new Alligator();

        String level;

        System.out.println();
        System.out.println("Player one ("+player1+")");
        System.out.println("Player two ("+player2+")");

        System.out.println();
        int firstPlayer = (new Random().nextInt(2)) + 1;

        if (firstPlayer == 1){
            player1.setPlayerTurn(true);
        } else {
            player2.setPlayerTurn(true);
        }

        String userInput;

        System.out.println("You awaken to find yourself in a barren moor.");
        System.out.println("There's an alligator coming towards you");
        System.out.println("Try 'Look' for help.");

        userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("look")) {

            System.out.println("LOL, You think it's that easy?");
            System.out.println("Ofcourse I'm not going to make it easy for you.");
            System.out.println();

            System.out.println("Each player has to roll 3 dices each time to move away from the alligator.");
            System.out.println();

            System.out.println("WAIT, Hold on");
            System.out.println();

            System.out.println("This is the exciting part...");
            System.out.println();

            System.out.println("I forgot to mention the alligator has to roll the dice as well.");
            System.out.println("And gets to roll the dice after each player.");

            System.out.println("If the alligator has a higher score than a player, that player is dead unless the player played less than the alligator");

            System.out.println();
            System.out.println("Level one: Alligator gets roll one dice, type '1'");
            System.out.println();
            System.out.println("Level two: Alligator gets roll two dices, type '2'");
            System.out.println();
            System.out.println("Level three: Alligator gets roll three dice, '3'");
            System.out.println();

            level = input.nextLine();




            System.out.println();
            System.out.println();

            while (isGameOn) {

            if(player1.getPlayerTurn()) {
                System.out.println("Player 1 to roll, Try 'Roll'");
            } else {
                System.out.println("Player 2 to roll, Try 'Roll'");
            }


            System.out.println("Try 'Roll'");
            userInput = input.nextLine();

            System.out.println();

            if (userInput.equalsIgnoreCase("roll")) {

                int total = 0;

                String letters[] = new String[]{"A", "B", "C"};

                Dice dice[] = new Dice[3];
                dice[0] = new Dice();
                dice[1] = new Dice();
                dice[2] = new Dice();

                for (int i = 0; i < dice.length; i++) {
                    int ss;
                    dice[i].Roll();

                    System.out.println();
                    System.out.println("Dice " + letters[i] + ": " + dice[i].getValue());
                    System.out.println("-------");
                    System.out.println(dice[i].getGraphicalValue());
                    System.out.println("-------");

                    total = total + dice[i].getValue();

                }

                System.out.println();
                System.out.println("Total: " + total);

                if(player1.getPlayerTurn()) {
                    player1.setTotal(total);

                    player1.setPlayerTurn(false);
                    player2.setPlayerTurn(true);
                } else {
                    player2.setTotal(total);
                    player2.setPlayerTurn(false);
                    player1.setPlayerTurn(true);
                }

                switch (level) {
                    case "1":{
                        alligator.roll(1);
                       // System.out.println("first");
                        break;

                    }

                    case "2": {
                        alligator.roll(2);
                      //  System.out.println("second");
                        break;
                    }
                    case "3": {
                        alligator.roll(3);
                      //  System.out.println("third");
                        break;
                    }
                }

                System.out.println();
                System.out.println("Player one total: "+player1.getTotal()+" (Played: "+player1.getPlayed()+"),  Player two total: "+player2.getTotal()+" (Played: "+player2.getPlayed()+")");
                System.out.println(alligator);

                if (alligator.getTotal() >= player1.getTotal() && alligator.getPlayed() == player1.getPlayed()) {
                    isGameOn = false;

                    System.out.println("Player two wins");

                    break;



                }
                if (alligator.getTotal() >= player2.getTotal() && alligator.getPlayed() == player2.getPlayed()) {

                    isGameOn = false;

                    System.out.println("Player one wins");
                    break;
                }


            }

            }


        }else {

            System.lineSeparator();
            System.lineSeparator();
            System.out.println("You awaken to find yourself in a barren moor. Try 'Look'");

        }


    }


    public static void main(String[] args) {
        new Main().StartGame();
    }
}
