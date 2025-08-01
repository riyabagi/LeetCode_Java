class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) {
            return 0;
        }

        List<Character> list = new ArrayList<>();
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (list.contains(ch)) {
                while (list.contains(ch)) {
                    list.remove(0);
                }
            }

            list.add(ch);

            if (list.size() == 3) {
                count++;
                list.remove(0);
            }
        }

        return count;
    }
}
