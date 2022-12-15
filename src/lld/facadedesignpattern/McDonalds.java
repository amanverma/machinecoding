package lld.facadedesignpattern;

public class McDonalds implements  Franchise{
    @Override
    public void diplayFranchiseDetails() {
        System.out.println("MC Donalds");

    }

    @Override
    public void getCostOfFranchise() {
        System.out.println("200 $");

    }
}
