import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedbyCharacters {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < chars.length(); i ++){
            char t = chars.charAt(i);
            map.put(t,map.getOrDefault(t,0) + 1);
        }
        int sum = 0;
        for(String w : words){
            Map<Character,Integer> tempmap = new HashMap<>(map);
            for(int i = 0; i < w.length(); i++){
                char  p = w.charAt(i);
                if(!map.containsKey(p)){
                    map = tempmap;
                    break;
                }
                int newValue = map.get(p) - 1;
                if(newValue == 0){
                    map.remove(p);
                }else{
                    map.put(p,newValue);
                }
                if(i == w.length() - 1){
                    sum += w.length();
                    map = tempmap;
                }
            }
        }
        return sum;
    }
}
