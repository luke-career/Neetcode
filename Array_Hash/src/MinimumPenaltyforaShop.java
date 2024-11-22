public class MinimumPenaltyforaShop {
    public int bestClosingTime(String customers) {
        int len = customers.length();
        int[] res = new int[len];
        int[] openPenalty = new int[len + 1];
        int[] closePenalty = new int[len + 1];
        for (int i = 0; i < len; i++) {
            if (customers.charAt(i) == 'Y') {
                res[i] = 1;
            } else if (customers.charAt(i) == 'N') {
                res[i] = 0;
            }
        }
        int close = 0;
        for (int i = 0; i < len; i++) {
            openPenalty[i] = close;
            if (res[i] == 0) {
                close++;
            }
        }
        openPenalty[len] = close;

        int open = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (res[i] == 1) {
                open++;
            }
            closePenalty[i] = open;
        }
        closePenalty[len] = 0;

        int result = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= len; i++) {
            int t = openPenalty[i] + closePenalty[i] ;
            if (t < min) {
                result = i;
                min = t;
            }

        }
        return result;
    }
}
