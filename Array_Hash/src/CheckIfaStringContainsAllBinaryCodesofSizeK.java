import java.util.HashSet;

public class CheckIfaStringContainsAllBinaryCodesofSizeK {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i+k <= s.length();i++){
            String sb = s.substring(i,i+k);
            hs.add(sb);
        }
        if(hs.size() == 1 << k ){
            return true;
        }
        return false;
    }
}
