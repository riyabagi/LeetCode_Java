class Solution {
    public String simplifyPath(String path) {
        String[] tokens = path.split("/");
        Stack<String> st = new Stack<>();

        for (String token : tokens) {
            if (token.equals("") || token.equals(".")) {
                continue;
            } else if (token.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(token);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String s : st) {
            result.append("/" + s);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}