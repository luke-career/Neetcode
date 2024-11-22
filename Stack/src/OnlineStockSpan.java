package src;

import java.util.Stack;

public class OnlineStockSpan {

    private class Pair {
        int price;
        int count;

        public Pair(int price, int count) {
            this.price = price;
            this.count = count;
        }

    }

    Stack<Pair> st;

    public OnlineStockSpan() {
        st = new Stack<>();
    }

    public int next(int price) {
        int count = 1;
        while (!st.isEmpty() && price >= st.peek().price) {
            count += st.pop().count;
        }
        st.push(new Pair(price, count));

        return st.peek().count;
    }
}
