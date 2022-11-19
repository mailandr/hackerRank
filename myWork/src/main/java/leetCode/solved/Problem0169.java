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

Approach 5: Randomization
Intuition
Because more than n/2 array indices are occupied by the majority element, a random array index is likely
to contain the majority element.

Algorithm
Because a given index is likely to have the majority element, we can just select a random index,
check whether its value is the majority element, return if it is, and repeat if it is not.
The algorithm is verifiably correct because we ensure that the randomly chosen value is the majority
element before ever returning.

Implementation

class Solution {
    private int randRange(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private int countOccurences(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public int majorityElement(int[] nums) {
        Random rand = new Random();

        int majorityCount = nums.length/2;

        while (true) {
            int candidate = nums[randRange(rand, 0, nums.length)];
            if (countOccurences(nums, candidate) > majorityCount) {
                return candidate;
            }
        }
    }

Approach 6: Divide and Conquer
Intuition
If we know the majority element in the left and right halves of an array, we can determine which is the global
majority element in linear time.

Algorithm
Here, we apply a classical divide & conquer approach that recurses on the left and right halves of an array until
an answer can be trivially achieved for a length-1 array. Note that because actually passing copies of subarrays
costs time and space, we instead pass lo and hi indices that describe the relevant slice of the overall array.
In this case, the majority element for a length-1 slice is trivially its only element, so the recursion stops there.
If the current slice is longer than length-1, we must combine the answers for the slice's left and right halves.
If they agree on the majority element, then the majority element for the overall slice is obviously the same1.
If they disagree, only one of them can be "right", so we need to count the occurrences of the left and right majority
elements to determine which subslice's answer is globally correct. The overall answer for the array is thus the
majority element between indices 0 and nnn.

Implementation

class Solution {
    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private int majorityElementRec(int[] nums, int lo, int hi) {
        // base case; the only element in an array of size 1 is the majority
        // element.
        if (lo == hi) {
            return nums[lo];
        }

        // recurse on left and right halves of this slice.
        int mid = (hi-lo)/2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length-1);
    }
}

Approach 7: Boyer-Moore Voting Algorithm

Intuition
If we had some way of counting instances of the majority element as +1 and instances of any other element as −1,
summing them would make it obvious that the majority element is indeed the majority element.

Algorithm
Essentially, what Boyer-Moore does is look for a suffix suf of nums where suf[0] is the majority element in that suffix.
To do this, we maintain a count, which is incremented whenever we see an instance of our current candidate for majority
element and decremented whenever we see anything else.
Whenever count equals 0, we effectively forget about everything in nums up to the current index and consider the current
number as the candidate for majority element. It is not immediately obvious why we can get away with forgetting
prefixes of nums - consider the following examples (pipes are inserted to separate runs of nonzero count).

[7, 7, 5, 7, 5, 1 | 5, 7 | 5, 5, 7, 7 | 7, 7, 7, 7]

Here, the 7 at index 0 is selected to be the first candidate for majority element. count will eventually reach 0 after
index 5 is processed, so the 5 at index 6 will be the next candidate. In this case, 7 is the true majority element,
so by disregarding this prefix, we are ignoring an equal number of majority and minority elements - therefore,
7 will still be the majority element in the suffix formed by throwing away the first prefix.

[7, 7, 5, 7, 5, 1 | 5, 7 | 5, 5, 7, 7 | 5, 5, 5, 5]

Now, the majority element is 5 (we changed the last run of the array from 7s to 5s), but our first candidate is still 7.
In this case, our candidate is not the true majority element, but we still cannot discard more majority elements
than minority elements (this would imply that count could reach -1 before we reassign candidate,
which is obviously false).

Therefore, given that it is impossible (in both cases) to discard more majority elements than minority elements,
we are safe in discarding the prefix and attempting to recursively solve the majority element problem for the suffix.
Eventually, a suffix will be found for which count does not hit 0, and the majority element of that suffix will
necessarily be the same as the majority element of the overall array.

Implementation

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
 */