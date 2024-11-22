package src;

import java.util.Stack;

public class RemovingStarsFromaString {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != '*'){
                st.push(c);
            }
            if(c == '*' &&  st.peek() != '*'){

                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
