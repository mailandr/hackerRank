package hackerRank.einfacheAufgaben;

import java.math.BigInteger;
import java.util.Scanner;

public class NJavaBigInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        BigInteger bI3 = new BigInteger(String.valueOf(a + b));
        BigInteger bI4 = new BigInteger(String.valueOf(a * (b / 10)));

        System.out.println(bI3 + "\n" + bI4);


    }
}
