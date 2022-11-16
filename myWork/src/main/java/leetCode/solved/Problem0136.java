package leetCode.solved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem0136 {
    public static void main(String[] args) {
        //int[] nums = {2, 2, 1};
        int[] nums = {9, 7, 5, 5, 7, 3, 1, 1, 3, 15, 88, 88, 15};
        //int[] nums = {4, 3, 4, 1, 1};
        //int[] nums = {4, 1, 2, 1, 2};
        //int[] nums = {9};

        int ac = singleNumber(nums);
        //singleNumber(nums);
        System.out.println(ac);
    }

    public static int singleNumber(int[] nums) {
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        List<Integer> list = new ArrayList<>();
//        List<Integer> listRemove = new ArrayList<>();
//        for (int num : nums) {
//            if (!list.contains(num)) {
//                list.add(num);
//            } else {
//                listRemove.add(num);
//            }
//        }
//        list.removeAll(listRemove);
//
//        return list.get(0);
//        int num = 0;
//
//        for (int i : nums) {
//            num = num ^ i;
//        }
//        return num;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
/*
Alternative mit XOR

Approach 2 -Using BitManipulation

Properties of XOR:

It returns the same number if weXOR with zero.
It return zero if we take XOR of two same numbers.
So We can XOR all the numbers in the given input, as per XOR properties;
all the duplicate number will zero out each other and we will be left with single number.

	int num = 0;

	for (int i : nums) {
	  num = num ^ i;
	}
	return num;



Approach 1 -Using hashmap

Maintain Hashmap and check the count against array
and return the elements if we found the one as a value,
Since there is only one unique element as soon as we get
value as 1 we return that element.

HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return 0;

 */
