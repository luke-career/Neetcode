public class ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] res = new double[101][101];
        res[0][0] = poured;
        for(int i = 0; i < 100; i++){
            for(int j = 0;j <= i;j++){
                if(res[i][j] > 1 ){
                    res[i+1][j+1] += (res[i][j] - 1) / 2;
                    res[i+1][j] += (res[i][j] - 1)/2;
                    res[i][j] = 1;
                }
            }
        }
        return  Math.min(1,res[query_row][query_glass]);
    }
}
