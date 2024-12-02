import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    ArrayList<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {

        StringBuilder sb = new StringBuilder();
        helper(s,0,sb,0);
        return res;
    }

    private void  helper(String s,int index,StringBuilder sb,int segment){
        if(index == s.length() && segment == 4){
            res.add(sb.toString().substring(0,sb.length() - 1));
            return;
        }

        if(segment == 4 || index == s.length()){
            return;
        }
        int prelen = sb.length();
        for(int i = index ;i < index + 3 &&  i < s.length(); i++){
            if(isValid(s.substring(index,i + 1))){
                sb.append(s.substring(index,i+1)).append('.');
                helper(s,i+1,sb,segment + 1);
                sb.setLength(prelen);
            }
        }
    }

    private boolean isValid(String s){
        if(s.isEmpty()) return false;
        if(s.length() > 1 && s.charAt(0) == '0') return false;
        int temp =  Integer.valueOf(s);
        if(temp >= 0 && temp <= 255){
            return true;
        }
        return false;
    }
}
