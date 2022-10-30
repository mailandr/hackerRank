package hackerRank.einfacheAufgaben;

import java.util.Scanner;

public class JavaUsernameRegularExpression {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        do {
            String text = sc.nextLine();
//        String[] sc = {"8", "Julia", "Samantha", "Samantha_21", "1Samantha",
//                "Samantha?10_2A", "JuliaZ007", "Julia@007", "_Julia007"};
            //for (int i = 0; i < text.length; i++) {
            if (text.matches("[a-z,A-Z]{1}[a-z,A-Z,0-9,_]{7,29}")) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        } while (sc.hasNextLine());

        //}
    }
}
