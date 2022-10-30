package codingCampus.Random;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

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
            Position feld = spielerAbfrage();
            spieler *= -1;
            feldSetzen(spielfeld, spieler, feld);

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
        } else if (feld == Position.MO ) {
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
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    }
}
