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

    /*
    Alternativen:

    Approach 1: Naive Approach
Intuition
The moment you hear of FizzBuzz you think whether the number is divisible by 3, 5 or both.

Algorithm
1) Initialize an empty answer list.
2) Iterate on the numbers from 1...N1 ... N1...N.
3) For every number, if it is divisible by both 3 and 5, add FizzBuzz to the answer list.
4) Else, Check if the number is divisible by 3, add Fizz.
5) Else, Check if the number is divisible by 5, add Buzz.
6) Else, add the number.

Implementation

class Solution {
    public List<String> fizzBuzz(int n) {

        // ans list
        List<String> ans = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {

            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if (divisibleBy3 && divisibleBy5) {
                // Divides by both 3 and 5, add FizzBuzz
                ans.add("FizzBuzz");
            } else if (divisibleBy3) {
                // Divides by 3, add Fizz
                ans.add("Fizz");
            } else if (divisibleBy5) {
                // Divides by 5, add Buzz
                ans.add("Buzz");
            } else {
                // Not divisible by 3 or 5, add the number
                ans.add(Integer.toString(num));
            }
        }

        return ans;
    }
}

     */

}
