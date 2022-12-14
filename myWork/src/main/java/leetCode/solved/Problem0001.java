package leetCode.solved;

import java.util.Arrays;


//Aufgaben Name: Two Sum


public class Problem0001 {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

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
        /*
    Approach 2: Two-pass Hash Table

    Intuition
    To improve our runtime complexity, we need a more efficient way to check if the complement exists in the array.
    If the complement exists, we need to get its index.
    What is the best way to maintain a mapping of each element in the array to its index? A hash table.

    We can reduce the lookup time from O(n)O(n)O(n) to O(1)O(1)O(1) by trading space for speed.
    A hash table is well suited for this purpose because it supports fast lookup in near constant time.
    I say "near" because if a collision occurred, a lookup could degenerate to O(n)O(n)O(n) time. However,
    lookup in a hash table should be amortized O(1)O(1)O(1) time as long as the hash function was chosen carefully.

    Algorithm
    A simple implementation uses two iterations. In the first iteration,
    we add each element's value as a key and its index as a value to the hash table.
    Then, in the second iteration, we check if each element's complement (target−nums[i]target - nums[i]target−nums[i])
    exists in the hash table. If it does exist, we return current element's index and its complement's index.
    Beware that the complement must not be nums[i]nums[i]nums[i] itself!

    Implementation:

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
         In case there is no solution, we'll just return null
        return null;


        Approach 3: One-pass Hash Table

        Algorithm
        It turns out we can do it in one-pass. While we are iterating and inserting elements into the hash table,
        we also look back to check if current element's complement already exists in the hash table. If it exists,
        we have found a solution and return the indices immediately.

        Implementation
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;


        **/


    }
}
