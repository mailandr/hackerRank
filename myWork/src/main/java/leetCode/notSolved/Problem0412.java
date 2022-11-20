package leetCode.notSolved;

import java.util.ArrayList;
import java.util.List;

public class Problem0412 {

    public static void main(String[] args) {

        int n = 45;

        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listInt.add(i, i + 1);
        }
        List<String> list = new ArrayList<>();

        for (int x : listInt) {
            if (x % 3 == 0 && x % 5 == 0) {
                list.add(x - 1, "FizzBuzz");
            } else if (x % 5 == 0) {
                list.add(x - 1, "Buzz");
            } else if (x % 3 == 0) {
                list.add(x - 1, "Fizz");
            } else {
                list.add(x - 1, "" + x);
            }
        }
        return list;
    }

}
