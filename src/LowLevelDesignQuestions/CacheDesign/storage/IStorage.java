package LowLevelDesignQuestions.CacheDesign.storage;

public interface IStorage<K,V> {
    public void add(K k, V v);
    public void remove(K k);
}
