package Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OperationsonTree {
    HashMap<Integer, Integer> map;
    int[] parent;
    ArrayList<Integer>[] children;

    public OperationsonTree (int[] parent) {
        this.parent = parent;
        map = new HashMap<>();
        int size = parent.length;
        children = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            children[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < size; i++) {
            int t = parent[i];
            if (t != -1) {
                children[t].add(i);
            }
        }
    }

    public boolean lock(int num, int user) {
        if (map.containsKey(num)) {
            return false;
        } else {
            map.put(num, user);
            return true;
        }
    }


    public boolean unlock(int num, int user) {
        return map.remove(num, user);
    }

    public boolean upgrade(int num, int user) {

        if (map.containsKey(num)) {
            return false;
        }

        int t = parent[num];

        if (checkParentLock(t)) {
            return false;
        }

        if (hasLockDescent(num)) {
            map.put(num, user);
            unLockDescent(num);
            return true;
        }
        return false;
    }

    private boolean checkParentLock(int num) {
        if (map.containsKey(num))
            return true;
        if (num == -1)
            return false;
        int p = num;
        return checkParentLock(parent[p]);

    }

    private void unLockDescent(int num) {

        List<Integer> temp = children[num];
        for (int i = 0; i < temp.size(); i++) {
            int t = temp.get(i);
            map.remove(t);
            unLockDescent(t);
        }
    }

    private boolean hasLockDescent(int num) {

        List<Integer> temp = children[num];
        for (int i = 0; i < temp.size(); i++) {
            int childrenNode = temp.get(i);

            if (map.containsKey(childrenNode)) return true;
            if(hasLockDescent(childrenNode)) return true;
        }
        return false;
    }
}
