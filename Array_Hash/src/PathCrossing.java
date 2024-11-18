import java.util.HashSet;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        int[] p = new int[]{0,0};
        String start = "0,0";
        HashSet<String> hs = new HashSet<>();
        hs.add(start);
        for(int i = 0; i < path.length(); i++){
            char w = path.charAt(i);
            if(w == 'E'){
                p[0] += 1;
            }else if(w == 'N'){
                p[1] += 1;
            }else if(w == 'S'){
                p[1] -= 1;
            }else if(w == 'W'){
                p[0] -= 1;
            }
            String q = p[0] + "," + p[1];
            if(hs.contains(q)) {
                return true;
            }
            hs.add(q);
        }
        return false;
    }
}
