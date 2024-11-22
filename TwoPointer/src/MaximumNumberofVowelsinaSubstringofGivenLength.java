public class MaximumNumberofVowelsinaSubstringofGivenLength {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u';

    }

    public int maxVowels(String s, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        int max = 0;
        while (r < s.length()) {
            if (isVowel(s.charAt(r))) {
                count++;
            }
            if (r - l + 1 > k) {
                if (isVowel(s.charAt(l))) {
                    count--;
                }
                l++;
            }
            max = Math.max(max, count);
            r++;
        }
        return max;
    }
}
