package hackerRank.einfacheAufgaben;

import java.util.Scanner;

public class JavaStdinAndStdoutV2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        double value2 = scanner.nextDouble();
        scanner.nextLine();
        String text = scanner.nextLine();

        //System.out.printf("String: %s\nDouble: %.4f\nInt: %d\n",text, value2 ,value);
        System.out.println("String: " + text);
        System.out.println("Double: " + value2);
        System.out.println("Int: " + value);
    }

}
