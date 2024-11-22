package src;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack= new Stack<>();
        for(String s : operations){
            if(s.equals("C")){
                stack.pop();
            }else if(s.equals("D")){
                int t = stack.peek();
                stack.push(2 * t);
            }else if(s.equals("+")){
                int m = stack.pop();
                int n = stack.pop();
                stack.push(n);
                stack.push(m);
                stack.push(m+n);
            }else{
                stack.push(Integer.valueOf(s));
            }

        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}
