package ds_algo.problems;

import java.util.ArrayList;

public class CountOddInterval {
    public static ArrayList<Integer> countOdds(int low, int high) {
        ArrayList<Integer> oddArray = new ArrayList<>();
        for(int i =low; i<high+1; i++){
            if(!(i%2==0)){
                oddArray.add(i);
            }
        }
        return oddArray;

    }
    public static void main(String[] args){
        System.out.println(countOdds(3,7));

       // System.out.println(countOdds(8,10));
    }
}
