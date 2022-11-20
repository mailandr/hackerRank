package leetCode.solved;

import java.util.Arrays;

public class Problem0283 {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        //int[] nums = {0};

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



    /*
    Approach

    Solution 2 | 30 ms | 12% time | 13% memory
    Use queue of integers to store indices of 0.

    class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> idxZero = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                idxZero.add(i);
            } else {
                if (!idxZero.isEmpty()) {
                    nums[idxZero.poll()] = nums[i];
                    nums[i] = 0;
                    idxZero.add(i);
                }
            }
        }
    }
}

Solution 1 | 3 ms | 72% time | 78% memory

Approach
If current value is not equal to 0, then place it sequentally to the beginning. And assign 0 to the current index value.
Thus, all non-zero numbers will be sequentally placed to the beginning and the rest will be zero.

class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[idx++] = temp;
            }
        }
    }
}

     */
}
