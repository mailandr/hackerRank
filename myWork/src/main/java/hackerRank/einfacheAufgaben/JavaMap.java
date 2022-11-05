package hackerRank.einfacheAufgaben;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String name = sc.nextLine();
            int phoneNum = sc.nextInt();
            sc.nextLine();
            phoneBook.put(name, phoneNum);
        }
        while (sc.hasNext()) {
            String input = sc.nextLine();
            if (phoneBook.get(input) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(input + "=" + phoneBook.get(input));
            }

        }
    }
}
