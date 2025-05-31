import java.util.*;

// Solution using map

class Solution {
    public int majorityElement(int[] nums) {

        int result = 0, count = 0;

        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int num : nums) {
            mp.put(num, 0);
        }

        for (int num : nums) {
            mp.put(num, mp.get(num) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (count < entry.getValue()) {
                count = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
}

// Solution in linear time and in O(1) space
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (candidate == num) ? 1 : -1;
        }

        return candidate;
    }
}