class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;
        
        Arrays.sort(nums);
        int score = Integer.MAX_VALUE;
        int left = 0, right = k - 1;

        while (right < nums.length) {
            score = Math.min(score, nums[right] - nums[left]);
            right++;
            left++;
        }

        return score;
    }
}