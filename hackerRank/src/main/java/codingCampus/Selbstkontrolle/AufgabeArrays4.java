package codingCampus.Selbstkontrolle;

import java.util.Arrays;

public class AufgabeArrays4 {
    public static void main(String[] args) {

        int[] arr = {0, 32, 54, 7, 19, 34, 6, 36, 8, 17, 13, 2};

        bubblesortAsc(arr);
    }

    public static void bubblesortAsc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int hold = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = hold;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
