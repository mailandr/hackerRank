package hackerRank.einfacheAufgaben;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int x = 10;//sc.nextInt();
            int y = 3;//sc.nextInt();

            System.out.println(x / y);
        }catch (InputMismatchException ime){
            System.out.println(ime.getClass().getName());
        }catch (java.lang.ArithmeticException jlae){
            System.out.println(jlae);
        }
    }
}
