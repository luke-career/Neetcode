public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        String[] s2 = s1.split(" ");
        return s2[s2.length - 1].length();
    }
}
