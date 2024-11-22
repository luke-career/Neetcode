package src;

import java.util.Stack;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c =  s.charAt(i);
            if(!st.isEmpty() && Math.abs(c - st.peek()) == 32){
                st.pop();
            }else{
                st.push(c);
            }

        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
