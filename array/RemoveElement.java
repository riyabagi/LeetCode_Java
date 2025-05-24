class Solution {
    public int removeElement(int[] nums, int val) {
        int newIndex = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val) {
                nums[newIndex++] = nums[index];
            }
        }
        return newIndex;
    }
}