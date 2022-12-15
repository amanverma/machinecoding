package lld.CacheDesign.exceptions;

public class StorageEmptyException extends RuntimeException{
    public StorageEmptyException(String message){
        super(message);
    }
}
