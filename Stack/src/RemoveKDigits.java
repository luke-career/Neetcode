package src;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {

        if(num.length() <= k) return "0";
        Stack<Character> st = new Stack();
        for(int i = 0; i < num.length(); i++ ){
            char c = num.charAt(i);
            while(!st.isEmpty() && k > 0 && st.peek() > c){
                st.pop();
                k--;
            }
            st.push(c);
        }

        while(!st.isEmpty() && k > 0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
