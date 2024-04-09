import java.util.Stack;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(sb.length());
                sb.append(c);
            } else if (c == ')') {
                if (!st.isEmpty()) {
                    st.pop();
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }
        while (!st.isEmpty()) {
            sb.deleteCharAt(st.pop());
        }

        return sb.toString();
    }
}
