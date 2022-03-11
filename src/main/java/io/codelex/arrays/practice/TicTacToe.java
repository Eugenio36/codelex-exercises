package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, what is your name?");
        String p1 = scanner.nextLine();
        System.out.println("Player 2, what is your name?");
        String p2 = scanner.nextLine();

        char[][] board = new char[3][3];            //Create board

        for (int i = 0; i < 3; i++) {               //Fill the board with dashes
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        boolean isPlayer1 = true;                   //Keep track of whose turn it is

        boolean gameEnded = false;                  //Keep track if game has ended;

        while (!gameEnded) {

            drawBoard(board);

            char symbol = ' ';
            if (isPlayer1) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }

            if (isPlayer1) {
                System.out.println(p1 + "'s Turn (X):");
            } else {
                System.out.println(p2 + "'s Turn (O):");
            }

            int row = 0;
            int column = 0;

            while (true) {
                System.out.println("Enter a row (0, 1, 2): ");
                row = scanner.nextInt();
                System.out.println("Enter a column (0, 1, 2): ");
                column = scanner.nextInt();

                if (row < 0 || column < 0 || row > 2 || column > 2) {
                    System.out.println("Invalid input!");
                } else if (board[row][column] != '-') {
                    System.out.println("Someone has already made a move there! You can not make a move here!");
                } else {
                    break;
                }
            }


            board[row][column] = symbol;                    //Setting the position on the board to player`s symbol


            if (hasWon(board) == 'X') {
                System.out.println(p1 + " has won");
                gameEnded = true;
            } else if (hasWon(board) == 'O') {
                System.out.println(p2 + " has won");
                gameEnded = true;
            } else {
                if (hasTied(board)) {
                    System.out.println("It`s a tie!");
                    gameEnded = true;
                } else {
                    isPlayer1 = !isPlayer1;
                }
            }
        }

        drawBoard(board);
    }


    public static void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static char hasWon(char[][] board) {
        //Row
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }

        //Column
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }

        //Diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }

        //Nobody won
        return '-';

    }

    //Check if the board is full
    public static boolean hasTied(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}