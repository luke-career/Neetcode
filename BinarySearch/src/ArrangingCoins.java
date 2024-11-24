public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long result = (long) mid * (mid + 1) / 2;
            if (result < n) {
                l = mid + 1;
            } else if (result > n) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return r;
    }
}
