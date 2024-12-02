import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    List<String> res = new ArrayList<String>();

    public List<String> letterCombinations(String digits) {
        if( digits == null || digits.length() == 0 ) return res;
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        StringBuilder sb = new StringBuilder();
        helper(digits,map,0,sb);
        return res;
    }

    private void helper(String digits, String[] map, int index, StringBuilder sb) {

        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }

        String temp = map[digits.charAt(index) - '0'];
        int len = sb.length();
        for (int i = 0; i < temp.length(); i++) {
            sb.append(temp.charAt(i));
            helper(digits, map, index + 1, sb);
            sb.setLength(len);
        }
    }
}
