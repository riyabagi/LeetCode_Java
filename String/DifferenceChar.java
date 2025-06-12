class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0, sum2 = 0;
        for(char c : s.toCharArray()){
            sum1 += (int)(c);
        }
        for(char c : t.toCharArray()){
            sum2 += (int)(c);
        }

        int result = sum2 - sum1;

        return (char)(result);
    }
}