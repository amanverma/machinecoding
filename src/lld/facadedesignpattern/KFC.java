package lld.facadedesignpattern;

public class KFC implements Franchise {
    @Override
    public void diplayFranchiseDetails() {
        System.out.println("KFC");

    }

    @Override
    public void getCostOfFranchise() {
        System.out.println("300$");

    }
}
