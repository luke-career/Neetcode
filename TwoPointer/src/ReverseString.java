package src;

public class ReverseString {
    public void reverseString(char[] s) {
        int len = s.length;
        int l = 0;
        int r = len - 1;
        while(l < r){
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            l++;
            r--;
        }
    }
}
