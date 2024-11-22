public class DesignParkingSystem {
    int[] types;

    public DesignParkingSystem (int big, int medium, int small) {
        types = new int[]{big,medium,small};
    }

    public boolean addCar(int carType) {
        int temp = types[carType - 1];
        if((temp - 1) >= 0){
            types[carType - 1] = temp - 1;
            return true;
        }else{
            return false;
        }
    }
}
