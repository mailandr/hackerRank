package leetCode.solved;

import java.util.HashMap;

public class Problem0169 {
    public static void main(String[] args) {

        int[] nums = {3, 2, 3};
        //int[] nums = {2, 2, 1, 1, 1, 2, 2};
        //int[] nums = {6,5,5};

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int hold = 0;
        int key = 0;
        for (int i : nums) {
            if (map.get(i) > hold) {
                hold = map.get(i);
                key = i;
            }
        }
        return key;
    }
}

/* Alternativen:
Approach 1: Brute Force
Intuition
We can exhaust the search space in quadratic time by checking whether each element is the majority element.

Algorithm
The brute force algorithm iterates over the array, and then iterates again for each number to count its occurrences.
As soon as a number is found to have appeared more than any other can possibly have appeared, return it.

 int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;
    }

Approach 2: HashMap
Intuition
We know that the majority element occurs more than n/2 times, and a HashMap allows us to count
element occurrences efficiently.

Algorithm
We can use a HashMap that maps elements to counts in order to count occurrences in linear time by looping over nums.
Then, we simply return the key with maximum value.

    class Solution {
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
}

Approach 3: Sorting
Intuition
If the elements are sorted in monotonically increasing (or decreasing) order, the majority element
can be found at index n/2 (and also at (n/2)−1, if n is even).

Algorithm
For this algorithm, we simply do exactly what is described: sort nums, and return the element in question.
They overlap at index n/2 for both even- and odd-length arrays.
Therefore, no matter what value the majority element has in relation to the rest of the array,
returning the value at n/2 will never be wrong.

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

Approach 4: Bit Manipulation
Intuition
If an element majority_element occurs more than n/2 times, then there are at least n/2 elements of identical values
 with num at each bit. That is, we can reconstruct the exact value of num by combining the most frequent
 value (0 or 1) at each bit.

Algorithm
Starting from the least significant bit, we enumerate each bit to determine which value is the majority at this bit,
0 or 1, and put this value to the corresponding bit of the result. Finally, we end up with the most least significant
bit of all elements and return the result.

Implementation
Because all numbers are in the range \[-10^9, 10^9\], which can be represented in 32-bit,
we only need to enumerate 32 bits.

        int[] nums = {3, 3, 2};
        int n = nums.length;
        int majority_element = 0;


        for (int i = 0; i < 32; i++) {
            int bit = 1 << i;
            System.out.println(bit);
            int bit_count = 0;
            for (int num : nums) {
                if ((num & bit) != 0) {
                    ++bit_count;
                }
            }
            if (bit_count > n / 2){
                majority_element |= bit;
            }
        }
        return majority_element;
    }

 */