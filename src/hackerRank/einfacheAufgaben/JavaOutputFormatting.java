package hackerRank.einfacheAufgaben;


import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d\n", s1, x);
            if (i == 2) {
                sc.close();
            } else {
                sc.nextLine();
            }
        }
        System.out.println("================================");

    }
}

