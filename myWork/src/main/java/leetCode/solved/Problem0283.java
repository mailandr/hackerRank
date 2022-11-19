package leetCode.solved;

import java.util.Arrays;

public class Problem0283 {
    public static void main(String[] args) {

        //int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {0};

        moveZeroes(nums);


    }

    public static void moveZeroes(int[] nums) {
        int countZeroes = 0;
        for (int x : nums) {
            if (x == 0) {
                ++countZeroes;
            }

        }
        int pos = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nums.length - pos] = nums[i];
                --pos;
            }
        }
        while (countZeroes > 0) {
            nums[nums.length - countZeroes] = 0;
            --countZeroes;
        }
        System.out.println(Arrays.toString(nums));
    }
}
