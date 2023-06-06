class MyHashSet {
    private final int len = 1000001;
    private boolean[] set;
    
    public MyHashSet() {
        set = new boolean[len];
    }
    
    public void add(int key) {
        int idx = key%len;
        set[idx] = true;   
    }
    
    public void remove(int key) {
        int idx = key%len;
        set[idx] = false;
    }
    public boolean contains(int key) {
        int idx = key%len;   
        return set[idx];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */