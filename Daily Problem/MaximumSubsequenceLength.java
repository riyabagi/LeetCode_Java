class Solution {
    public int maximumLength(int[] nums) {
        int size = nums.length;
        int count0 = 0;
        int count1 = 0;

        for(int num : nums) {
            if(num % 2 == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        int alt = 1;
        int parity = nums[0] % 2;

        for(int index = 1; index < size; index++) {
            int currentParity = nums[index] % 2;
            if(parity != currentParity) {
                alt ++;
                parity = currentParity;
            }
        }

        return Math.max(Math.max(count0, count1), alt);
    }
}