package Test;

import Solution.LRUCache;

public class Test {

    public static void main(String[] args){
      LRUCache res = new LRUCache(2);
      res.put(2,3);
      res.put(3,4);
      res.put(4,5);

      res.get(2);
    }
}
