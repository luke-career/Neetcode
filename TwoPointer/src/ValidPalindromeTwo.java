package src;

public class ValidPalindromeTwo {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        int cout = 0;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                if(cout == 0){
                    boolean f =  helper(s,l+1,r) || helper(s,l,r-1);
                    if(!f) return false;
                    cout++;
                }
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean helper(String s1, int left, int right ){
        while(left < right){
            if(s1.charAt(left) != s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
