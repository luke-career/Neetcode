package src;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesinStringTwo {

    class Pair {
        char c;
        int count;

        public Pair(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!st.isEmpty() && c == st.peek().c) {
                int count = st.peek().count + 1;
                st.pop();
                st.push(new Pair(c, count));
            } else {
                st.push(new Pair(c, 1));
            }

            if (!st.isEmpty() && st.peek().count == k) {
                st.pop();
            }

        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty() ){
            int t = st.peek().count;
            while(t > 0){
                sb.append(st.peek().c);
                t--;
            }
            st.pop();
        }

        return sb.reverse().toString();
    }
}
