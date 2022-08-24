package LowLevelDesignQuestions.CacheDesign.algorithms;

public class DLLNode<E> {
    DLLNode next;
    DLLNode prev;
    E e;

    DLLNode(E e ){
        this.e = e;
        this.prev = null;
        this.next = null;

    }
}
