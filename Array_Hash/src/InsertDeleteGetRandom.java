import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom {
    HashMap<Integer,Integer> map;
    List<Integer> list;

    public InsertDeleteGetRandom() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(!map.containsKey(val)){
            list.add(val);
            map.put(val,list.size() - 1);
            return true;
        }
        return false;


    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }else{
            int end = list.size() - 1;
            int index = map.get(val);
            int temp = list.get(end);
            list.set(end,val);
            list.set(index, temp);

            map.remove(val);
            list.remove(end);
            map.put(temp,index);

        }
        return true;
    }
    public int getRandom() {
        Random r = new Random();
        return list.get(r.nextInt(list.size()));
    }
}
