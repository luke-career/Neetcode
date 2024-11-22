package src;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {


    Queue<Integer> q1;
    Queue<Integer> q2;

    public ImplementStackusingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.offer(x);
    }

    public int pop() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int top = q1.poll();

        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }

        return top;
    }

    public int top() {

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int top = q1.poll();


        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }

        q1.offer(top);

        return top;
    }
    public boolean empty() {
        return q1.size() == 0;
    }
}
