import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 9; i++){
            int  sum = i;
            for(int j = i+1; j <= 9; j++){
                sum = sum * 10 + j;
                if(sum >= low && sum <= high){
                    list.add(sum);
                }else if(sum > high){
                    break;
                }
            }
        }

        Collections.sort(list);
        return list ;
    }
}
