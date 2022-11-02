package codingCampus.Selbstkontrolle;

import java.util.Arrays;

public class AufgabeArrays3 {
    public static void main(String[] args) {

        int input = 10;
        int[] arr = fillArray(input);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] fillArray(int num) {
        int[] arr = new int[num + 1];
        int hold = 0;
        for (int i = 0; i <= num; i++) {
            arr[i] = hold;
            ++hold;
        }
        return arr;
    }
}
