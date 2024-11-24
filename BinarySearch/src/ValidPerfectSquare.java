public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int l = 0;
        int r = num;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long temp = (long) mid * mid;

            if (temp > num) {
                r = mid - 1;
            } else if (temp < num) {
                l = mid + 1;
            } else if (temp == num) {
                return true;
            }
        }
        return false;
    }
}
