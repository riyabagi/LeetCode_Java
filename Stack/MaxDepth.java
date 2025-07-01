class Solution {
    public int maxDepth(String s) {
        int maxCount = 0, count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if (ch == ')') {
                count--;
            }
        }
        return maxCount;
    }
}
