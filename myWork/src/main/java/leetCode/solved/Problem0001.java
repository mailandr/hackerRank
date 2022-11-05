package leetCode.solved;

import java.util.Arrays;

//Aufgaben Name: Two Sum


public class Problem0001 {

    public static void main(String[] args) {

        int[] nums = {3, 3, 15, 18};
        int target = 6;

        int[] nums2 = twoSum(nums, target);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }

        }
        return null;
    }
}
