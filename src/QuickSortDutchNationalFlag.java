import java.util.Arrays;

public class QuickSortDutchNationalFlag {

    /*Algo: Segregate array based on pivot element. After this step, the pivot is in its final position. This is the important partition step.
    Post this, sub-arrays can be segregated recursively. */
    public static void quickSort(int[] arr,int begin, int end){
        if(begin<end){
            int pivotIndex = getPivotIndex(arr,begin,end);
            quickSort(arr, begin, pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }

    public static int getPivotIndex(int[] arr, int begin, int end){
        int pivot = arr[begin];
        int i=begin+1;
        for(int j=begin+1; j<=end; j++){
            if(arr[j]<=pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[i-1];
        arr[i-1] = arr[begin];
        arr[begin] = temp;
        return i--;
    }

    private static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Time Complexity: O(n) and Space: O(1).
    //Variant: Segregate 0 and 1s in array.
    public static int[] pivotSegregation(int[] arr, int pivot){
        int i=0; int j=arr.length-1;
        while(i<j){
            if(arr[i]<arr[pivot]){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j--] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args){
        int arr[] = {1,3,123,212,45,87,5,2,4,7,9,11,12,16,67,74,14,99,94};

        //Problem-1
//        int[] result = pivotSegregation(arr, 3);
//        Arrays.stream(result).forEach(x->
//                System.out.println(x));

        System.out.println("\n"+ "QuickSort Outcome:");
        //Problem-2
        quickSort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(x->
                System.out.println(x));


    }
}

