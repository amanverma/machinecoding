package LowLevelDesignQuestions.DesignATMMachine;

import java.util.HashMap;

public class ATM {
    HashMap<Integer,Integer> map;

    public ATM(){
        map = new HashMap<>();
        map.put(20,0);
        map.put(50,0);
        map.put(100,0);
        map.put(200,0);
        map.put(500,0);
    }
    public void deposit(int[] bankNotesCount) throws InvalidDepositException{
        if(bankNotesCount.length==5){
            map.put(20, map.get(Denomination.valueOf("TWENTY").getDenomination()) + bankNotesCount[0]);
            map.put(50, map.get(Denomination.valueOf("FIFTY").getDenomination()) + bankNotesCount[1]);
            map.put(100, map.get(Denomination.valueOf("HUNDRED").getDenomination()) + bankNotesCount[2]);
            map.put(200, map.get(Denomination.valueOf("TWOHUNDRED").getDenomination()) + bankNotesCount[3]);
            map.put(500, map.get(Denomination.valueOf("FIVEHUNDRED").getDenomination()) + bankNotesCount[4]);
        }
        else{
            throw new InvalidDepositException("Invalid Amount Deposited!!");
        }

    }

    //high denomination notes will be given priority else return -1
    public int[] withdraw(int amount){
        int[] withdrawNotes = new int[]{0,0,0,0,0};
        if(checkAmountCanbeDispensed(amount)){
            for(int i=map.size()-1;  i >=0; i --){
                withdrawNotes[i] = getNotes(i, amount);
                amount = amount - withdrawNotes[i]*getDenomination(i);
            }
            if(amount==0){
                return withdrawNotes;
            }else{
                //restore notes
            }
        }
        return new int[]{-1};
    }

    private int getNotes(int i, int amount) {
        int val = amount/getDenomination(i);
        if(val>0){
            int countLeft = (map.get(getDenomination(i))-val)>0?(map.get(getDenomination(i))-val):0;
            map.put(getDenomination(i), countLeft);
        }
        return amount/getDenomination(i);
    }

    private int getDenomination(int i) {
        if(i==0) return 20;
        if(i==1) return 50;
        if(i==2) return 100;
        if(i==3) return 200;
        if(i==4) return 500;
        return 1;
    }

    private boolean checkAmountCanbeDispensed(int amount) {
        int curr_amount = amount;
        if((curr_amount/Denomination.FIVEHUNDRED.getDenomination() < map.get(500)) && amount>500) {
            return false;
        }else if(amount > 500 && curr_amount/Denomination.FIVEHUNDRED.getDenomination() > map.get(500)){
            int val = curr_amount/Denomination.FIVEHUNDRED.getDenomination();
            curr_amount = curr_amount-val*500;
        }

        if((curr_amount/Denomination.TWOHUNDRED.getDenomination() < map.get(200)) && amount>200) {
            int val = curr_amount/Denomination.TWOHUNDRED.getDenomination();
            curr_amount = curr_amount-val*200;
            return false;
        }
        if((curr_amount/Denomination.HUNDRED.getDenomination() < map.get(100)) && amount>100) {
            int val = curr_amount/Denomination.HUNDRED.getDenomination();
            curr_amount = curr_amount-val*100;
            return false;
        }

        if((curr_amount/Denomination.FIFTY.getDenomination() < map.get(50)) && amount>50) {
            int val = curr_amount/Denomination.FIFTY.getDenomination();
            curr_amount = curr_amount-val*50;
            return false;
        }

        if((curr_amount/Denomination.TWENTY.getDenomination() < map.get(20)) && amount>20) {
            int val = curr_amount/Denomination.TWENTY.getDenomination();
            curr_amount = curr_amount-val*20;
            return false;
        }

        return true;
    }
}
