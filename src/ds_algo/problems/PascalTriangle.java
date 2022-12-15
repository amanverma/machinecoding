package ds_algo.problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> integers = new ArrayList<>();
        for(int i=0; i<= rowIndex; i++) {
            integers.add(getPascalRow(rowIndex, i));
        }
        return integers;
    }

    private static int getPascalRow(int rowIndex, int columnIndex) {
        //Base case
        if(rowIndex==0 || columnIndex ==0 || rowIndex==columnIndex){
            return 1;
        }
        return getPascalRow(rowIndex-1,columnIndex) + getPascalRow(rowIndex-1, columnIndex-1);

    }

    public static void main(String[] args){
        List<Integer> integerList = getRow(4);
        integerList.stream().forEach(i->
                System.out.println(i));
    }
}
