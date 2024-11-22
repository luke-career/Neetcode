package src;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] res = path.split("/");
        Stack<String> st = new Stack<>();

        for (String s : res) {
            if (s.equals("") || s.equals("."))
                continue;

            if (s.equals("..")) {
                if(!st.isEmpty())
                    st.pop();
            } else {
                st.push(s);
            }
        }
        if(st.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }
        return sb.toString();
    }
}
