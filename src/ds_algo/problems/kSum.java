package ds_algo.problems;

import java.util.*;

public class kSum {

    public static void main(String[] args){
        int[] arr = new int[]{1, 4, 45, 6, 10, 8 };
        //int [] res = getTwoSum(arr, 22);
        //int [] res = getThreeSum(arr, 22);
       // int [] res = getThreeSumHash(arr, 22);
//        for(int i=0; i<res.length; i++){
//            System.out.println(res[i]);
//        }
    }

    private static int[] getTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length ; i++){
            int diff = target-arr[i];
            if(map.containsKey(diff) && diff>0){
                return new int[]{map.get(diff),i};
            }
            map.put(arr[i],i);
        }
        return null;
    }

    private static int[] getThreeSum(int[] arr, int target){
        //Brute force --> O(n^3) Three loops
        //Sort the array -> n(Log(n)) -> Fix one element then Two Pointer approach to find sum.=> O(n^2)
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i ++){
            int a = arr[i];
            int diff = target-a;
            int start = i+1;
            int end = arr.length-1;
            while(start<end){
                if(arr[start]+arr[end]==diff){
                    return new int[]{arr[i],arr[start],arr[end]};
                }
                else if(arr[start]+arr[end]<diff){
                    start++;
                }else if(arr[start]+arr[end]>diff){
                    end--;
                }
            }
        }
        return null;
    }

    private static List<List<Integer>> getThreeSumHash(int[] arr, int target){
        //Use HashMap -> more easy compared to two pointer approach;
        //Time complexity (On^2), space O(n)
        HashSet<Integer> map = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            int curr_sum = target - arr[i];
            HashSet<Integer> seen = new HashSet<>();
            for(int j=i+1; j< arr.length-1; j++){
                if(map.contains(curr_sum-arr[j]) && !(seen.contains(curr_sum-arr[j]))){
                    list.add(Arrays.asList(arr[i], arr[j], curr_sum-arr[j]));
                    seen.add(curr_sum-arr[j]);
                }
                map.add(arr[j]);
            }
        }
        return list;
    }

    //Provide generic ds_algo.problems.solution for ds_algo.problems.kSum
//    public static int[] getKSum(int[] arr, int k , int target){
//        HashSet<Integer> map = new HashSet<>();
//        Arrays.sort(arr);
//
//    }
}
