// Using while loop

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int index = 0;

        while (index < nums.length) {
            int start = nums[index];
            while (index + 1 < nums.length && nums[index + 1] == nums[index] + 1) {
                index++;
            }
            int end = nums[index];

            if (start == end) {
                list.add(String.valueOf(start));
            } else {
                list.add(start + "->" + end);
            }
            index++;
        }
        return list;
    }
}