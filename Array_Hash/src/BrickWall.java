import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(List<Integer> list : wall){

            int sum = 0;
            for(int i = 0;i < list.size() - 1; i++){
                sum += list.get(i);
                map.put(sum,map.getOrDefault(sum,0) + 1);
            }
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            max = Math.max(entry.getValue(),max);
            
        }

        return wall.size() - max;


    }
}
