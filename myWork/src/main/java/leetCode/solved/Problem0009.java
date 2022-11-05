package leetCode.solved;

import java.util.Arrays;

public class Problem0009 {
    public static void main(String[] args) {

        int x = 121;
        System.out.println(isPalindrom(x));
    }

    public static boolean isPalindrom(int x) {

        String text = x + "";
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }

        }
        return true;


//         * Alternative:
//        String str = new String();
//        str = String.valueOf(x);
//        for (int i = 0; i < str.length() / 2; i++)
//            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
//                return false;
//            }
//        return true;


    }

}

