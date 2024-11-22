import java.util.HashSet;

public class OptimalPartitionofString {
    public int partitionString(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count = 1;
        for(int end = 0; end < s.length(); end++){
            char c = s.charAt(end);
            if(hs.contains(c)){
                hs.clear();
                count++;
            }
            hs.add(c);
        }
        return count;
    }
}

