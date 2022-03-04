package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
            {'X', ' ', 'O'},
            {'O', 'X', 'X'},
            {' ', 'X', 'O'},
};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("(...a game already in progress)");
        displayBoard();

        System.out.println("'O', choose your location (row, column): 0 1");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        board[x][y] = 'O';
        displayBoard();

        System.out.println("'X', choose your location (row, column): 2 0");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        board[x1][y1] = 'X';
        displayBoard();

        System.out.println("The game is a tie.");
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println(board[0][0] + " " + board[0][1] + " " + board[0][2]);
        System.out.println(board[1][0] + " " + board[1][1] + " " + board[1][2]);
        System.out.println(board[2][0] + " " + board[2][1] + " " + board[2][2]);
    }
}