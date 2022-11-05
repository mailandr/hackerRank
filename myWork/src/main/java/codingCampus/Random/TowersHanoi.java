package codingCampus.Random;

import java.util.Arrays;

public class TowersHanoi {
    public static void main(String[] args) {

        int[][] hanoi = new int[3][4];

        printBoard(hanoi);
        initializeBoard(hanoi);
        printBoard(hanoi);
    }

    public static int hanoiMove(int from, int to, int using, int count) {


        return 0;
    }

    public static void initializeBoard(int[][] board) {
        for (int j = 0; j < 4; j++) {
            board[0][j] = 4 - j;
        }


//        board[0][0] = 4;

    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
