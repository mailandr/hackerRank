package hackerRank.hackerRank;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 1;
        do {
            String read = sc.nextLine();
            System.out.println(count + " " + read);
            count++;
        } while (sc.hasNextLine());


//        //funktioniert auch:

//
//        while (true) {
//            if (sc.hasNextLine()) {
//                String read = sc.nextLine();
//                System.out.println(count + " " + read);
//                count++;
//            } else {
//                sc.close();
//            }
//        }
    }
}
