package src;

import java.util.Stack;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int l = 0;
        int r = 0;

        while (l < pushed.length) {
            int n = pushed[l];
            st.push(n);
            while (!st.isEmpty() && st.peek() == popped[r]) {
                st.pop();
                r++;
            }
            l++;
        }
        return st.isEmpty();
    }

}
