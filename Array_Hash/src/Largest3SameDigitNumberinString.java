public class Largest3SameDigitNumberinString {
    public String largestGoodInteger(String num) {
        int max = -1;
        int i = 0;
        while (i + 3 <= num.length()) {
            String s = num.substring(i, i + 3);
            if (s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(2)) {
                max = Math.max(Integer.valueOf(s), max);
            }
            i++;
        }

        if (max == -1) {
            return "";
        } else if (max == 0) {
            return "000";
        } else {
            return String.valueOf(max);
        }
    }
}
