package Solution;

public class DesignLinkedList {
    class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }


    class MyLinkedList {

        Node left;
        Node right;
        int size;


        public MyLinkedList() {
            left = new Node(0);
            right = new Node(0);
            left.next = right;
            right.prev = left;

        }

        public int get(int index) {
            if (index >= size) return -1;
            Node p = left;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            return p.next.val;
        }

        public void addAtHead(int val) {

            Node l = left.next;
            Node newNode = new Node(val);
            left.next = newNode;
            newNode.prev = left;

            newNode.next = l;
            l.prev = newNode;
            size++;


        }

        public void addAtTail(int val) {
            Node l = right.prev;

            Node newNode = new Node(val);
            l.next = newNode;
            newNode.prev = l;
            newNode.next = right;
            right.prev = newNode;
            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index > size) return;
            Node p = left;
            Node newNode = new Node(val);
            while (index > 0) {
                p = p.next;
                index--;
            }

            Node r = p.next;
            p.next = newNode;
            newNode.prev = p;
            newNode.next = r;
            r.prev = newNode;
            size++;
        }


        public void deleteAtIndex(int index) {
            if (size == 0 || index >= size) return;
            Node p = left;
            while (index > 0) {
                p = p.next;
                index--;
            }
            Node r = p.next.next;
            p.next = r;
            r.prev = p;
            size--;
        }
    }
}