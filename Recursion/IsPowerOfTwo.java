class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        if (n == 1)
            return true;

        if (n % 2 == 1)
            return false;

        return helper(n, 0);
    }

    public static boolean helper(int n, int i) {
        if (Math.pow(2, i) >= n) {
            if (Math.pow(2, i) == n) {
                return true;
            } else {
                return false;
            }
        }

        return helper(n, i + 1);
    }
}