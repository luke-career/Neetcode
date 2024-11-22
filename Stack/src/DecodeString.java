package src;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<String> st1 = new Stack();
        Stack<Integer> st2 = new Stack();
        StringBuilder sb = new StringBuilder();

        int len = s.length() - 1;
        int currentNumber = 0;
        for (int i = 0; i <= len; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + c - '0';
            } else if (c == '[') {
                st2.push(currentNumber);
                st1.push(sb.toString());
                sb.setLength(0);
                currentNumber = 0;
            } else if (c == ']') {
                int n = st2.pop();
                String p = st1.pop();
                StringBuilder  r = new StringBuilder(p);
                for(int j = n; j >0; j--){
                    r.append(sb);
                }
                sb = r;
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
