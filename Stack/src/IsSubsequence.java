package src;

import java.util.Stack;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        Stack<Character> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            st.push(c);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
