class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.isEmpty())  return 0;

        String[] input = s.split("\\s+");
        return input.length;
    }
}