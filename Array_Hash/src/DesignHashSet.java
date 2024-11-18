public class DesignHashSet {
    private boolean[] s;

    public DesignHashSet() {
        s =  new boolean[1000001];
    }

    public void add(int key) {
        s[key] = true;
    }

    public void remove(int key) {
        s[key] = false;
    }

    public boolean contains(int key) {
        return s[key] == true;
    }
}
