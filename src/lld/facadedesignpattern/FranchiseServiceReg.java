package lld.facadedesignpattern;

public class FranchiseServiceReg {
    private Franchise KFC;
    private Franchise BurgerKing;
    private Franchise McDonalds;
    public FranchiseServiceReg(){
        this.KFC = new KFC();
        this.BurgerKing= new McDonalds();
        this.McDonalds = new BurgerKing();
    }

    public void buyKFCFranchise(){
        KFC.diplayFranchiseDetails();
        KFC.getCostOfFranchise();

    }
    public void buyBKFranchise(){
        this.BurgerKing.diplayFranchiseDetails();
        this.BurgerKing.getCostOfFranchise();
    }
    public void buyMcDonaldsFranchise(){
        McDonalds.diplayFranchiseDetails();
        McDonalds.getCostOfFranchise();
    }

}
