package lld.facadedesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Welcome to Franchise Service Registration...!n");
        System.out.print(" 1. KFC n");
        System.out.print(" 2. McDonalds n");
        System.out.print(" 3. Burger King n");
        System.out.print(" 4. EXIT n");
        System.out.print("Please Enter your Franchise Option Number: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(br.readLine());
        FranchiseServiceReg sp = new FranchiseServiceReg();

        switch (choice) {
            case 1: {
                sp.buyKFCFranchise();
            }
            break;
            case 2: {
                sp.buyMcDonaldsFranchise();
            }
            break;
            case 3: {
                sp.buyBKFranchise();
            }
            break;
            default: {
                System.out.println("Please Check the input and try again");
            }
        }

    }
}
