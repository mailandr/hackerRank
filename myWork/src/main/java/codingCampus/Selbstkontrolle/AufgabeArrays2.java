package codingCampus.Selbstkontrolle;

import java.sql.SQLOutput;

public class AufgabeArrays2 {
    public static void main(String[] args) {

        int[] arr = {0, 32, 54, 7, 19, 34, 6, 36, 8, 17, 13, 2};

        System.out.println("Minimum: " + getMin(arr));
        System.out.println("Maximum: " + getMax(arr));
        System.out.println("Average: " + getAvg(arr));
    }

    public static int getAvg(int[] arr) {
        int count = 0;
        for (int x : arr) {
            count += x;
        }
        count /= arr.length;
        return count;
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}
