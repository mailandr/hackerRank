package hackerRank.einfacheAufgaben;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    public static void main(String[] args) {

        String a = "anagram";
        String b = "margana";

        String al = a.toLowerCase();
        String bl = b.toLowerCase();

        char[] aArr = al.toCharArray();
        char[] bArr = bl.toCharArray();

        Arrays.sort(aArr);      // sortiert das Array, lexikographisch aufsteigend
        Arrays.sort(bArr);

//        char tmp = ' ';
//        for (int i = 0; i < aArr.length; i++) {
//            for (int j = 0; j < aArr.length - 1; j++) {
//                if (aArr[j] > aArr[j + 1]) {
//                    tmp = aArr[j];
//                    aArr[j] = aArr[j + 1];
//                    aArr[j + 1] = tmp;
//                }
//            }
//        }
//        for (int i = 0; i < bArr.length; i++) {
//            for (int j = 0; j < bArr.length - 1; j++) {
//                if (bArr[j] > bArr[j + 1]) {
//                    tmp = bArr[j];
//                    bArr[j] = bArr[j + 1];
//                    bArr[j + 1] = tmp;
//                }
//            }
//        }
        if (Arrays.equals(aArr, bArr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
