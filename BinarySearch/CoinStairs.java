class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        int j = n;

        while (i <= j) {
            int m = i + (j - i) / 2;
            long sum = (long) m * (m + 1) / 2;

            if (sum == n) {
                return m;
            } else if (sum < n) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }

        return j; 
    }
}
