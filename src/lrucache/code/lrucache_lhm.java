package lrucache.code;

//Approach 1 : LinkedHashMap
/*We're asked to implement the structure which provides the following operations in \mathcal{O}(1)O(1) time :

- Get the key / Check if the key exists

- Put the key

- Delete the first added key

The first two operations in O(1) time are provided by the standard hashmap, and the last one - by linked list.
In Java both map and linked list are combined in LinkedHashMap and in Python as OrderedDictionary*/

import java.util.LinkedHashMap;
import java.util.Map;

public class lrucache_lhm extends LinkedHashMap {
    private int capacity;
    public lrucache_lhm(int capacity){
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }
    public int getKey(int key){
        return (int) super.getOrDefault(key, -1);
    }
    public void putKey(int key, int value){
        super.put(key, value);
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest){
        return size()>capacity;
    }


}
