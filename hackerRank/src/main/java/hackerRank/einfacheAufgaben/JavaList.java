package hackerRank.einfacheAufgaben;

import java.util.*;

public class JavaList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()){
                liste.add(sc.nextInt());
            }
        }
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            String input = sc.next();
            if (input.equals("Insert")){
                int index = sc.nextInt();
                int newVariable = sc.nextInt();
                liste.add(index,newVariable);
            }else if (input.equals("Delete")){
                int index = sc.nextInt();
                liste.remove(index);
            }
        }
        for (int x : liste) {
            System.out.print(x + " ");
        }

    }
}
