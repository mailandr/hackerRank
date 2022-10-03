package hackerRank.hackerRank;

import java.util.Scanner;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        BigInteger big = new BigInteger(n);

        if (big.isProbablePrime(1)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }


    }
}
