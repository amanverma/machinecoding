package ds_algo.problems;

import java.util.Arrays;

public class EvenOddArray {
    public static int[] getEvenOddArray(int[] arr){ //Time complexity => O(n), Space Complexity = O(1)
        int i= 0; int j = arr.length-1;
        while(i<j){
            if(arr[i]%2==0){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,3,5,2,4,7,9,11,12,14,16,67,74,99,94};
        Arrays.stream(getEvenOddArray(arr)).forEach(x->
                System.out.println(x));
    }
}
