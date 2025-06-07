class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int val = columnNumber % 26;
            result.append((char) (val + 'A'));
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}