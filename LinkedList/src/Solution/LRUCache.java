package Solution;

import java.util.HashMap;

class Node {
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

   public class LRUCache {

        HashMap<Integer, Node> map;
        int capacity;
        Node left;
        Node right;
        int size;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>();
            left = new Node(0, 0);
            right = new Node(0, 0);
            left.next = right;
            right.prev = left;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                Node p = map.get(key);
                removeNode(p);
                insertNode(p);
                return p.val;
            } else {
                return -1;
            }

        }

        public void put(int key, int value) {

            if (size == capacity) {

                removeNode(right.prev);
                map.remove(right.prev.key);
            }

            if (size < capacity) {
                if (map.containsKey(key)) {
                    Node k = map.get(key);
                    k.val = value;
                    removeNode(k);
                    insertNode(k);
                } else {

                    Node newNode = new Node(key, value);
                    map.put(key, newNode);
                    insertNode(newNode);
                }
            }

        }

        private void removeNode(Node n) {
            Node p = n.prev;
            Node q = n.next;
            p.next = q;
            q.prev = p;
            size--;
        }

        private void insertNode(Node n) {
            size++;
            left.next = n;
            n.next = right;
            right.prev = n;
            n.prev = left;
        }
    }

