package lld.DesignATMMachine;

public class InvalidDepositException extends Exception{
    public InvalidDepositException(String errorMessage){
        super(errorMessage);
    }
}
