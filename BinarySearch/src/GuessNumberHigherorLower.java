/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */

public class GuessNumberHigherorLower {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        while (l <= r) {

            int p = l + (r - l) / 2;
            int result = guess(p);
            if (result > 0) {
                l = p + 1;
            } else if (result < 0) {
                r = p - 1;
            } else {
                return p;
            }
        }
        return -1;
    }
}
