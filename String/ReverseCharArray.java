class Solution {
    public void reverseString(char[] s) {
        int size = s.length - 1;
        for (int i = 0, j = size; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}