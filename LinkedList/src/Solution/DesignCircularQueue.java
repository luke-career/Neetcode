package Solution;

public class DesignCircularQueue {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

    }

    class MyCircularQueue {

        Node front;
        Node rear;
        int capacity;
        int size;

        public MyCircularQueue(int k) {
            this.capacity = k;
            this.front = null;
            this.rear = null;
            this.size = 0;
        }

        public boolean enQueue(int value) {
            if (size == 0) {
                Node enNode = new Node(value);
                front = enNode;
                rear = front;
                front.next = rear;
                rear.next = front;
                size++;
                return true;
            } else if (size < capacity) {
                Node enNode = new Node(value);
                rear.next = enNode;
                rear = enNode;
                rear.next = front;
                size++;
                return true;
            }

            return false;
        }

        public boolean deQueue() {
            if (size > 1) {
                front = front.next;
                rear.next = front;
                size--;
                return true;
            }else if(size == 1){
                front = null;
                rear = null;
                size--;
                return true;
            }
            return false;
        }
        public int Front() {
            if(front == null) return -1;
            return front.val;
        }
        public int Rear() {
            if(rear == null) return -1;
            return rear.val;
        }
        public boolean isEmpty() {
            return size == 0;
        }
        public boolean isFull() {
            return size == capacity;
        }
    }
}
