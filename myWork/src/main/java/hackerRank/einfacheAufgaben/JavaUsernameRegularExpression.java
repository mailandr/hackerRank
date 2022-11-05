package hackerRank.einfacheAufgaben;

import java.util.Scanner;

public class JavaUsernameRegularExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i <size; i++) {
            String text = sc.next();
//        String[] sc = {"8", "Julia", "Samantha", "Samantha_21", "1Samantha",
//                "Samantha?10_2A", "JuliaZ007", "Julia@007", "_Julia007"};
            //for (int i = 0; i < text.length; i++) {
            if (text.matches("[a-z,A-Z]{1}[a-z,A-Z,0-9,_]{7,29}")) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
