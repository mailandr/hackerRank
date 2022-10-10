package hackerRank.einfacheAufgaben;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        String A = "hello";                 // Input A
        String B = "java";                  // Input B

        int first = A.length();             // mit length() werden die Char im String gezählt
        int second = B.length();

        char[] a = A.toCharArray();         // erstellt Char Array aus dem String
        char[] b = B.toCharArray();

        System.out.println(first + second);

        if (a[0] > b[0]) {                  // prüfft ob Array Index 0 von String A lexicografisch größer ist als Index 0 von String B
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        A = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();     //Verwandelt ersten Buchstab to Uppercase und den rest zu Lowercase
        B = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();

        System.out.println(A + " " + B);
        String text = "milan";
        //char[] text2 = text.toCharArray();


        text = text.substring(0,3).toUpperCase() + text.substring(3).toLowerCase();

        System.out.println(text);


    }


}
