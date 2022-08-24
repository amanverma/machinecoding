package LowLevelDesignQuestions.DesignATMMachine;

public enum Denomination {
    //each Constant enum value can have fields
    //the field values must be supplied via Constructor of enum while defining constants.
    TWENTY(20), FIFTY(50), HUNDRED(100), TWOHUNDRED(200), FIVEHUNDRED(500);

    private final int denomination;
    //enum will never use public or protected constructors
    private Denomination(int denomination){
        this.denomination = denomination;
    }

    //we can add public methods to enum class
    public int getDenomination(){
        return this.denomination;
    }
}
