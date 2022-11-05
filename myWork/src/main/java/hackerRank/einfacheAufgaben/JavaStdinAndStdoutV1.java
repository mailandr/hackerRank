package hackerRank.einfacheAufgaben;

import java.util.Scanner;

public class JavaStdinAndStdoutV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int value2 = sc.nextInt();
        int value3 = sc.nextInt();
        System.out.printf("%d\n%d\n%d\n", value, value2, value3);
        sc.close();
    }
}
