package LowLevelDesignQuestions.DesignATMMachine;

public class Driver {
    public static void main(String[] args) throws InvalidDepositException {
        ATM atm = new ATM();
        atm.deposit(new int[]{0,0,1,2,1});
        print(atm.withdraw(600)); // returns []
        atm.deposit(new int[]{0,1,0,1,1});
        print(atm.withdraw(600));  // returns -1
        print(atm.withdraw(550));  // returns []
    }

    private static void print(int[] withdraw) {
        for(int i = 0 ; i <withdraw.length; i ++){
            System.out.println(withdraw[i]);
        }
        System.out.println("\n");
    }
}
