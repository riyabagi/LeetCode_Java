class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int index = 0; index < columnTitle.length(); index++) {
            char ch = columnTitle.charAt(index);
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }
}