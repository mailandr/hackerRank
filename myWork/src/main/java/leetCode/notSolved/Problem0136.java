package leetCode.notSolved;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                list.remove(num);
            } else {
                list.add(num);
            }
        }
        return list.get(0);
    }
}
