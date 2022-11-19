package leetCode.solved;


import java.util.Arrays;

import static java.util.Arrays.sort;

public class Problem0242 {

    public static void main(String[] args) {

//        String t = "nagaram";
//        String s = "anagram";
        String s = "rat";
        String t = "car";

        boolean isA = isAnagram(s, t);
        System.out.println(isA);
    }

    public static boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        sort(arrS);
        sort(arrT);

        return Arrays.equals(arrS, arrT);
    }
}
