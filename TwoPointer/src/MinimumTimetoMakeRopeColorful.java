public class MinimumTimetoMakeRopeColorful {
    public int minCost(String colors, int[] neededTime) {
        int len = colors.length();
        int time = 0;

        for (int i = 0; i < colors.length() - 1; i++) {

            if(colors.charAt(i) == colors.charAt(i + 1)) {
                if (neededTime[i] > neededTime[i + 1]) {
                    time += neededTime[i + 1];

                    neededTime [i+1] = neededTime[i];
                } else {
                    time += neededTime[i];

                }
            }

        }
        return time;
    }
}
