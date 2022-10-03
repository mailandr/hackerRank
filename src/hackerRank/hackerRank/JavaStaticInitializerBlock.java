package hackerRank.hackerRank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int breite = sc.nextInt();
        int hoehe = sc.nextInt();
        if (breite <= 0 || hoehe <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            int area = hoehe * breite; // oder einfach System.out.println(hoehe*breite);
            System.out.println(area);
        }
    }
}
