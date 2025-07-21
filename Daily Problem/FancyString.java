class Solution {
    public String makeFancyString(String s) {
        if (s.length() <= 2) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        int count = 1;
        result.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == s.charAt(i - 1)) {
                count++;
                if (count <= 2) {
                    result.append(ch);
                }
            } else {
                result.append(ch);
                count = 1;
            }
        }
        return result.toString();
    }
}