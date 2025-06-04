class Solution {
    public int romanToInt(String s) {
        int size = s.length() - 1;
        int result = 0, prevValue = 0;
        for (int index = size; index >= 0; index--) {
            int currValue = 0;
            if (s.charAt(index) == 'I') {
                currValue = 1;
            } else if (s.charAt(index) == 'V') {
                currValue = 5;
            } else if (s.charAt(index) == 'X') {
                currValue = 10;
            } else if (s.charAt(index) == 'L') {
                currValue = 50;
            } else if (s.charAt(index) == 'C') {
                currValue = 100;
            } else if (s.charAt(index) == 'D') {
                currValue = 500;
            } else if (s.charAt(index) == 'M') {
                currValue = 1000;
            }

            if (currValue >= result || prevValue == currValue) {
                result += currValue;
            } else {
                result -= currValue;
            }
            prevValue = currValue;
        }

        return result;
    }
}