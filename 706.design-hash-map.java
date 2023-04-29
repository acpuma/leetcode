/*
 * @lc app=leetcode id=706 lang=java
 *
 * [706] Design HashMap
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class MyHashMap {
    List<Integer> keys;
    List<Integer> values;

    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        int index = findKeyIndex(key);
        if (index > -1) {
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }
    
    public int get(int key) {
        int index = findKeyIndex(key);
        if (index>-1) {
            return values.get(index);
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = findKeyIndex(key);
        if (index>-1) {
            keys.remove(index);
            values.remove(index);
        }
    }

    private int findKeyIndex(int key) {
        for (int i=0; i<keys.size(); i++) {
            if (keys.get(i)==key) {
                return i;
            } 
        }
        return -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
// @lc code=end

