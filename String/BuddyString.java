class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        int diff1 = -1, diff2 = -1;
        Set<Character> A_letters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (diff1 == -1)
                    diff1 = i;
                else if (diff2 == -1)
                    diff2 = i;
                else
                    return false; 
            }
            A_letters.add(s.charAt(i));
        }
        if (diff1 != -1 && diff2 != -1) 
            return s.charAt(diff1) == goal.charAt(diff2) && s.charAt(diff2) == goal.charAt(diff1);
        if (diff1 != -1)
            return false;
        return A_letters.size() < s.length();
    }
}