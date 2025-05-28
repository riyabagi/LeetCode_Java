class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length - 1;

        for (int index = size; index >= 0; index--) {
            if (digits[index] < 9) {
                digits[index]++;
                return digits;
            }
            digits[index] = 0;
        }

        int[] newNumber = new int[size + 2];
        newNumber[0] = 1;

        return newNumber;
    }
}