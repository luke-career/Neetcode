import java.util.HashMap;

public class LargestSubstringBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max = -1;
        for(int i = 0; i < s.length();i++){
            char temp = s.charAt(i);
            if(map.containsKey(temp)){
                max = Math.max(max,i - map.get(temp) -1);
            }else{
                map.put(temp,i);
            }

        }
        return max;
    }
}
