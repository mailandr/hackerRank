package leetCode.notSolved;

public class Problem0136 {
    public static void main(String[] args) {
        //int[] nums = {2, 2, 1};
        //int[] nums = {9, 7, 5, 5, 7};
        //int[] nums = {4, 3, 4, 1, 1};
        int[] nums = {4, 1, 2, 1, 2};
        //int[] nums = {9};

        int ac = singleNumber(nums);
        //singleNumber(nums);
        System.out.println(ac);
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sumL = 0;
        int sumR = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length / 2) {
                sumL += nums[i];
            } else if (i > nums.length / 2) {
                sumR += nums[i];
            }
        }
        if (sumL - sumR == 0) {
            return nums[nums.length / 2];
        }
        if (sumL % 2 == 0 && sumR % 2 == 0) {
            if (sumL > sumR) {
                return (sumL - sumR) + nums[nums.length / 2];
            } else {
                return (sumR - sumL) + nums[nums.length / 2];
            }
        }
        if (sumL > sumR && sumL > nums[nums.length / 2]) {
            return sumL - nums[nums.length / 2];
        }
        if (sumL > sumR && sumL < nums[nums.length / 2]) {
            return nums[nums.length / 2] - sumL;
        }
        if (sumR > sumL && sumR > nums[nums.length / 2]) {
            return sumR - nums[nums.length / 2];
        }
        //if (sumR > sumL && sumR < nums[nums.length / 2]) {
            return nums[nums.length / 2] - sumR;
        //}
        //return 150;
    }
}
