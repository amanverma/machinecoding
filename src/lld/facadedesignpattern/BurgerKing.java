package lld.facadedesignpattern;

public class BurgerKing implements Franchise{
    @Override
    public void diplayFranchiseDetails() {
        System.out.println("Burger King");
    }

    @Override
    public void getCostOfFranchise() {
        System.out.println("100 $");

    }
}
