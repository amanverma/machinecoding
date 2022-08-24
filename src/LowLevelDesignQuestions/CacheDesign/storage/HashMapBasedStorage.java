package LowLevelDesignQuestions.CacheDesign.storage;

import LowLevelDesignQuestions.CacheDesign.exceptions.StorageFullException;

import java.util.HashMap;

public class HashMapBasedStorage<K,V> implements IStorage{
    HashMap<K,V> map;
    int maxSize;

    HashMapBasedStorage(int maxSize){
        this.map = new HashMap<>();
        this.maxSize = maxSize;
    }
    @Override
    public void add(Object o, Object o2) {
        if(map.size()>=maxSize){
            throw new StorageFullException("Storage is full!");
            //remove first from dll and attach new to last

        }else{
            if(map.containsKey(o)){
                //get node from dll detach and add to last

            }
        }



    }

    @Override
    public void remove(Object o) {

    }
}
