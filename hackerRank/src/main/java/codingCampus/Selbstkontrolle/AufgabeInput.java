package codingCampus.Selbstkontrolle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AufgabeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prompt = "Bitte geben Sie einen Text ein:";
        String prompt2 = "Wie oft soll der Text ausgegeben werden?";
        String userText = userInputString(sc, prompt);
        int userInt = userInputInt(sc, prompt2);
        printUserInput(userText, userInt);
    }

    public static String userInputString(Scanner sc, String prompt) {
        String text = "";
        do {
            System.out.println(prompt);
            text = sc.nextLine();
        } while (text.equals(""));
        return text;
    }

    public static int userInputInt(Scanner sc, String prompt2) {
        System.out.println(prompt2);
        int value = Integer.MIN_VALUE;
        do {
            try {
                value = sc.nextInt();
                if (value < 1) {
                    System.out.println("Die Zahl muss größer als 0 sein :");
                    value = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Leider keine gültige Zahl!" + "\n" + prompt2);
                sc.nextLine();
            }
        } while (value == Integer.MIN_VALUE);
        sc.close();
        return value;
    }

    public static void printUserInput(String inputText, int inputNum) {
        for (int i = 0; i < inputNum; i++) {
            System.out.println(inputText);
        }
    }
}
