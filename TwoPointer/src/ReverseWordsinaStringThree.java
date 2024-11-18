package src;

public class ReverseWordsinaStringThree {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String st : str){
            res.append(helper(st));
            res.append(" ");
        }
        return res.toString().trim();
    }

    private String helper(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
