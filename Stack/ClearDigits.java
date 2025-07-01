class Solution {
    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack();

        for (char ch : s.toCharArray()) {
            if (!st.empty() && Character.isDigit(ch)) {
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        while(!st.empty()){
            res.append(st.pop());
        }

        return res.reverse().toString();
    }
}