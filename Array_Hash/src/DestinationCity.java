import java.util.HashSet;
import java.util.List;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        String des = "" ;
        HashSet<String> hs = new HashSet<>();
        for(List<String> l : paths){
            hs.add(l.get(0));
        }

        for(List<String> l:paths){
            if(!hs.contains(l.get(1))){
                des =  l.get(1);
            }
        }
        return des ;
    }
}
