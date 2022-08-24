package LowLevelDesignQuestions.CacheDesign.algorithms;

import LowLevelDesignQuestions.CacheDesign.exceptions.KeyNotFoundException;

public class DLL<E> {
    DLLNode first;
    DLLNode last;

    public void removeFirst(){
        DLLNode temp = this.first.next;
        temp.prev = null;
        this.first = temp;
    }
    public void addToLast(E e){
        DLLNode temp = new DLLNode(e);
        this.last.next = temp;
        temp.prev = this.last;
        this.last = temp;
    }
    public void detachNode(E e){
        DLLNode temp = this.first;
        while(temp.next!=null){
            if(temp.next.e==e){
                DLLNode temp2 = temp.next;
                temp2.next.prev = temp;
                temp.next = temp2.next;
            } else throw new KeyNotFoundException("Key not found!");
            temp = temp.next;
        }
    }

}
