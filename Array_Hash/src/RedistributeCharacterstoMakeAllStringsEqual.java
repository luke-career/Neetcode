import java.util.HashMap;
import java.util.Map;

public class RedistributeCharacterstoMakeAllStringsEqual {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = words.length;
        for(String s : words){
            for(int i = 0; i < s.length();i++ ){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int temp =  entry.getValue();
            if(temp %  len != 0) return false;
        }
        return true;
    }
}
