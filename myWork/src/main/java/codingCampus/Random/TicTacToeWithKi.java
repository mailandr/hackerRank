package codingCampus.Random;

import java.util.Scanner;

public class TicTacToeWithKi {
    static class Move {
        int row, col;
    }

    enum Position {
        LO, MO, RO, LM, MM, RM, LU, MU, RU;

    }

    public static void main(String[] args) {


        int[][] spielfeld = new int[3][3];
        int spieler = -1;
        int roundCount = 0;
        printArray(spielfeld);
        do {
            ++roundCount;
            spieler *= -1;

            if (spieler == -1) {
                Move bestMove = findBestMove(spielfeld);
                System.out.printf("Der beste Zug ist:\n");
                System.out.printf("Zeile: %d Spalte: %d\n",
                        bestMove.row, bestMove.col);
                Position feld = transformMoveIntoPosition(bestMove.row, bestMove.col);
                feldSetzen(spielfeld, spieler, feld);

            } else {
                Position feld = spielerAbfrage();
                feldSetzen(spielfeld, spieler, feld);
            }


        } while (roundCount < 9
                && !(spielfeld[0][0] == 1 && spielfeld[0][1] == 1 && spielfeld[0][2] == 1)
                && !(spielfeld[1][0] == 1 && spielfeld[1][1] == 1 && spielfeld[1][2] == 1)
                && !(spielfeld[2][0] == 1 && spielfeld[2][1] == 1 && spielfeld[2][2] == 1)
                && !(spielfeld[0][0] == 1 && spielfeld[1][0] == 1 && spielfeld[2][0] == 1)
                && !(spielfeld[0][1] == 1 && spielfeld[1][1] == 1 && spielfeld[2][1] == 1)
                && !(spielfeld[0][2] == 1 && spielfeld[1][2] == 1 && spielfeld[2][2] == 1)
                && !(spielfeld[0][0] == 1 && spielfeld[1][1] == 1 && spielfeld[2][2] == 1)
                && !(spielfeld[0][2] == 1 && spielfeld[1][1] == 1 && spielfeld[2][0] == 1)
                && !(spielfeld[0][0] == 2 && spielfeld[0][1] == 2 && spielfeld[0][2] == 2)
                && !(spielfeld[1][0] == 2 && spielfeld[1][1] == 2 && spielfeld[1][2] == 2)
                && !(spielfeld[2][0] == 2 && spielfeld[2][1] == 2 && spielfeld[2][2] == 2)
                && !(spielfeld[0][0] == 2 && spielfeld[1][0] == 2 && spielfeld[2][0] == 2)
                && !(spielfeld[0][1] == 2 && spielfeld[1][1] == 2 && spielfeld[2][1] == 2)
                && !(spielfeld[0][2] == 2 && spielfeld[1][2] == 2 && spielfeld[2][2] == 2)
                && !(spielfeld[0][0] == 2 && spielfeld[1][1] == 2 && spielfeld[2][2] == 2)
                && !(spielfeld[0][2] == 2 && spielfeld[1][1] == 2 && spielfeld[2][0] == 2));

        if (roundCount < 9
                && (spielfeld[0][0] == 1 && spielfeld[0][1] == 1 && spielfeld[0][2] == 1)
                || (spielfeld[1][0] == 1 && spielfeld[1][1] == 1 && spielfeld[1][2] == 1)
                || (spielfeld[2][0] == 1 && spielfeld[2][1] == 1 && spielfeld[2][2] == 1)
                || (spielfeld[0][0] == 1 && spielfeld[1][0] == 1 && spielfeld[2][0] == 1)
                || (spielfeld[0][1] == 1 && spielfeld[1][1] == 1 && spielfeld[2][1] == 1)
                || (spielfeld[0][2] == 1 && spielfeld[1][2] == 1 && spielfeld[2][2] == 1)
                || (spielfeld[0][0] == 1 && spielfeld[1][1] == 1 && spielfeld[2][2] == 1)
                || (spielfeld[0][2] == 1 && spielfeld[1][1] == 1 && spielfeld[2][0] == 1)) {
            System.out.println("Herzlichen Glückwunsch!!!\nSpieler 1 hat Gewonnen!!!!");
        } else if (roundCount < 9
                && (spielfeld[0][0] == 2 && spielfeld[0][1] == 2 && spielfeld[0][2] == 2)
                || (spielfeld[1][0] == 2 && spielfeld[1][1] == 2 && spielfeld[1][2] == 2)
                || (spielfeld[2][0] == 2 && spielfeld[2][1] == 2 && spielfeld[2][2] == 2)
                || (spielfeld[0][0] == 2 && spielfeld[1][0] == 2 && spielfeld[2][0] == 2)
                || (spielfeld[0][1] == 2 && spielfeld[1][1] == 2 && spielfeld[2][1] == 2)
                || (spielfeld[0][2] == 2 && spielfeld[1][2] == 2 && spielfeld[2][2] == 2)
                || (spielfeld[0][0] == 2 && spielfeld[1][1] == 2 && spielfeld[2][2] == 2)
                || (spielfeld[0][2] == 2 && spielfeld[1][1] == 2 && spielfeld[2][0] == 2)) {
            System.out.println("Herzlichen Glückwunsch!!!\nSpieler 2 hat Gewonnen!!!!");

        } else {
            System.out.println("Unentschieden!!!");
        }
    }

    public static void feldSetzen(int[][] spielfeld, int spieler, Position feld) {
        if (spieler == -1) {
            spieler = 2;
        }
        if (feld == Position.LO) {
            spielfeld[0][0] = spieler;
        } else if (feld == Position.MO) {
            spielfeld[0][1] = spieler;
        } else if (feld == Position.RO) {
            spielfeld[0][2] = spieler;
        } else if (feld == Position.LM) {
            spielfeld[1][0] = spieler;
        } else if (feld == Position.MM) {
            spielfeld[1][1] = spieler;
        } else if (feld == Position.RM) {
            spielfeld[1][2] = spieler;
        } else if (feld == Position.LU) {
            spielfeld[2][0] = spieler;
        } else if (feld == Position.MU) {
            spielfeld[2][1] = spieler;
        } else if (feld == Position.RU) {
            spielfeld[2][2] = spieler;
        }
        printArray(spielfeld);
    }


    public static Position spielerAbfrage() {
        Scanner sc = new Scanner(System.in);
        String line = "";
        do {
            System.out.print("Auf welcher Position möchten sie setzen?\n[LO][MO][RO]\n[LM][MM][RM]\n[LU][MU][RU]\n>>");
            line = sc.nextLine();
            switch (line) {
                case "LO":
                    return Position.LO;
                case "MO":
                    return Position.MO;
                case "RO":
                    return Position.RO;
                case "LM":
                    return Position.LM;
                case "MM":
                    return Position.MM;
                case "RM":
                    return Position.RM;
                case "LU":
                    return Position.LU;
                case "MU":
                    return Position.MU;
                case "RU":
                    return Position.RU;
            }

        } while (!line.equals("LO") || !line.equals("MO") || !line.equals("RO") ||
                !line.equals("LM") || !line.equals("MM") || !line.equals("RM") ||
                !line.equals("LU") || !line.equals("MU") || !line.equals("RU"));

        return null;
    }

    public static void printArray(int[][] field) {
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "");
            }
            System.out.println();
        }
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    }

    public static Position transformMoveIntoPosition(int bestmoveR, int bestmoveC) {

        if (bestmoveR == 0 && bestmoveC == 0) {
            return Position.LO;
        } else if (bestmoveR == 0 && bestmoveC == 1) {
            return Position.MO;
        } else if (bestmoveR == 0 && bestmoveC == 2) {
            return Position.RO;
        } else if (bestmoveR == 1 && bestmoveC == 0) {
            return Position.LM;
        } else if (bestmoveR == 1 && bestmoveC == 1) {
            return Position.MM;
        } else if (bestmoveR == 1 && bestmoveC == 2) {
            return Position.RM;
        } else if (bestmoveR == 2 && bestmoveC == 0) {
            return Position.LU;
        } else if (bestmoveR == 2 && bestmoveC == 1) {
            return Position.MU;
        } else if (bestmoveR == 2 && bestmoveC == 2) {
            return Position.RU;
        }
        return null;
    }

    static Move findBestMove(int[][] board) {
        int bestVal = -1000;
        Move bestMove = new Move();
        bestMove.row = -1;
        bestMove.col = -1;

        // Traverse all cells, evaluate minimax function
        // for all empty cells. And return the cell
        // with optimal value.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Check if cell is empty
                if (board[i][j] == 0) {
                    // Make the move
                    board[i][j] = 2;

                    // compute evaluation function for this
                    // move.
                    int moveVal = minimax(board, 0, false);

                    // Undo the move
                    board[i][j] = 0;

                    // If the value of the current move is
                    // more than the best value, then update
                    // best/
                    if (moveVal > bestVal) {
                        bestMove.row = i;
                        bestMove.col = j;
                        bestVal = moveVal;
                    }
                }
            }
        }
        return bestMove;
    }

    static int minimax(int[][] board, int depth, Boolean isMax) {
        int score = evaluate(board);

        // If Maximizer has won the game
        // return his/her evaluated score
        if (score == 10)
            return score;

        // If Minimizer has won the game
        // return his/her evaluated score
        if (score == -10)
            return score;

        // If there are no more moves and
        // no winner then it is a tie
        if (!isMovesLeft(board))
            return 0;

        // If this maximizer's move
        if (isMax) {
            int best = -1000;

            // Traverse all cells
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check if cell is empty
                    if (board[i][j] == 0) {
                        // Make the move
                        board[i][j] = 2;

                        // Call minimax recursively and choose
                        // the maximum value
                        best = Math.max(best, minimax(board,
                                depth + 1, false));

                        // Undo the move
                        board[i][j] = 0;
                    }
                }
            }
            return best;
        }

        // If this minimizer's move
        else {
            int best = 1000;

            // Traverse all cells
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check if cell is empty
                    if (board[i][j] == 0) {
                        // Make the move
                        board[i][j] = 2;

                        // Call minimax recursively and choose
                        // the minimum value
                        best = Math.min(best, minimax(board,
                                depth + 1, true));

                        // Undo the move
                        board[i][j] = 0;
                    }
                }
            }
            return best;
        }
    }

    static int evaluate(int[][] b) {
        // Checking for Rows for X or O victory.
        for (int row = 0; row < 3; row++) {
            if (b[row][0] == b[row][1] &&
                    b[row][1] == b[row][2]) {
                if (b[row][0] == 2)
                    return +10;
                else if (b[row][0] == 1)
                    return -10;
            }
        }

        // Checking for Columns for X or O victory.
        for (int col = 0; col < 3; col++) {
            if (b[0][col] == b[1][col] &&
                    b[1][col] == b[2][col]) {
                if (b[0][col] == 2)
                    return +10;

                else if (b[0][col] == 1)
                    return -10;
            }
        }

        // Checking for Diagonals for X or O victory.
        if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
            if (b[0][0] == 2)
                return +10;
            else if (b[0][0] == 1)
                return -10;
        }

        if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
            if (b[0][2] == 2)
                return +10;
            else if (b[0][2] == 1)
                return -10;
        }

        // Else if none of them have won then return 0
        return 0;
    }

    static Boolean isMovesLeft(int[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == 0)
                    return true;
        return false;
    }
}
