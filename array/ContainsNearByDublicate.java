class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int index = 0; index < nums.length; index++) {
            if (mp.containsKey(nums[index]) && Math.abs(mp.get(nums[index]) - index) <= k) {
                return true;
            }

            mp.put(nums[index], index);
        }

        return false;
    }
}