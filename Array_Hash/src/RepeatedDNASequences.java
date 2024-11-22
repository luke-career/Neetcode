import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i = 0; i + 10 <= s.length(); i++){
            String s1 = s.substring(i,i+10);
            map.put(s1,map.getOrDefault(s1,0) + 1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String k = entry.getKey();
            int v = entry.getValue();
            if(v > 1){
                list.add(k);
            }
        }

        return list;
    }
}
