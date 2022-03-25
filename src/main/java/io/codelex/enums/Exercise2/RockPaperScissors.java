package io.codelex.enums.Exercise2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPlays = 1;
        int wins = 0;
        int losses = 0;


        System.out.println("Let us begin...");

        while (true) {

            System.out.println("Scissor-Paper-Stone");
            System.out.println("Your turn (Enter 'S' for scissors, 'P' for paper, 'R' for rock, q to quit): ");

            String playerMove = scanner.nextLine().toLowerCase();


            if (playerMove.equals("quit") || playerMove.equals("q")) {
                float lossesPercentage = (float) (losses * 100 / numOfPlays);
                float winsPercentage = (float) (wins * 100 / numOfPlays);

                System.out.println("Number of trials: " + numOfPlays);
                System.out.println("I won " + losses + "(" + lossesPercentage + "%). You won "
                        + wins + "(" + winsPercentage + "%).");
                System.out.println("Bye!");
                break;
            }

            if (invalidInput(playerMove)) {
                System.out.println("Invalid input, try again...");
                continue;
            }

            String computerMove = getComputerMove();

            if (playerMove.equals(computerMove)) {
                System.out.println("My turn: " + Move.getMove(computerMove));
                System.out.println("Tie! \n");
                numOfPlays++;

            } else if (isPlayerWin(playerMove, computerMove)) {
                System.out.println("My turn: " + Move.getMove(computerMove));
                System.out.println("You won! \n");
                wins++;
                numOfPlays++;

            } else {
                System.out.println("My turn: " + Move.getMove(computerMove));
                System.out.println("You lost! \n");
                losses++;
                numOfPlays++;
            }
        }
    }

    private static String getComputerMove() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        return Move.values()[randomNumber].getMove();
    }

    private static boolean isPlayerWin(String playerMove, String computerMove) {
        return playerMove.equals(Move.ROCK.getMove()) && computerMove.equals(Move.SCISSORS.getMove())
                || (playerMove.equals(Move.SCISSORS.getMove()) && computerMove.equals(Move.PAPER.getMove()))
                || (playerMove.equals(Move.PAPER.getMove()) && computerMove.equals(Move.ROCK.getMove()));
    }

    private static boolean invalidInput(String playerMove) {
        return Arrays.stream(Move.values()).noneMatch(item -> item.getMove().equals(playerMove));
    }

}
