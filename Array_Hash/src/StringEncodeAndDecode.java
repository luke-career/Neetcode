import java.util.ArrayList;
import java.util.List;

public class StringEncodeAndDecode {
    public String encode(List<String> strs) {
        if(strs.size() == 0) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();

        for(String s: strs){
            sizes.add(s.length());
        }
        for(int size: sizes){
            res.append(size).append(",");
        }
        res.append("#");
        for(String s : strs){
            res.append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) return new ArrayList<>();

        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#'){
            StringBuilder temp = new StringBuilder();
            while(str.charAt(i) != ','){
                temp.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(temp.toString()));
            i++;
        }
        i++;
        for(int s:sizes){
            res.add(str.substring(i,i+s));
            i += s;
        }
        return res;
    }
}
