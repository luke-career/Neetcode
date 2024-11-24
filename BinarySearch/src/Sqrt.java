public class Sqrt {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;

        while(l <= r){
            int mid = l + (r - l) / 2;
            long temp = mid * mid;
            if(temp > x){
                r = mid - 1;
            }else if(temp < x){
                l = mid + 1;
            }else if(temp == x){
                return mid;
            }
        }
        return r;
    }
}
