package LowLevelDesignQuestions.CacheDesign.policies;

public interface iEvictionPolicy {
    void evict();
    void add();
}
