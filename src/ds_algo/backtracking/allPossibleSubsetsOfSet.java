package ds_algo.backtracking;

import java.util.*;
import java.util.stream.Collectors;

//all power sets - 2^N
//permutations -> N!, and Combinations - nCk
//Three approaches - recursion, ds_algo.fuzzySearchAutoComplete.backtracking and lexicographic generation based on binary bitmasks
//Solution -> there will be two recursive calls, whether to pick element or leave it. O(2^N)
public class allPossibleSubsetsOfSet {
    final static List<List<Integer>> finalListofList = new ArrayList<>();
    final static HashSet<String> hashOfHash = new HashSet<String>();
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5};
//        List<List<Integer>> sets = printAllSubsets(nums);
//        for(List<Integer> set: sets){
//            System.out.println(set);
//        }

//        List<Integer> numsList = new ArrayList<>();
//        numsList.add(1);
//        numsList.add(2);
//        numsList.add(3);
//        numsList.add(4);
//        numsList.add(5);

        subsetRecursiveSolution(nums, new HashSet<Integer>(),0);
        for(List<Integer> set: finalListofList){
            System.out.println(set);
            System.out.println("\n");
        }
    }

//    private static List<List<Integer>> printAllSubsets(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        subsets(list, new ArrayList<>(), nums, 0);
//        return list;
//    }

    private static void subsets(List<List<Integer>> listOfSets, List<Integer> resultList, int[] nums, int start){
        listOfSets.add(new ArrayList<>(resultList));
        for(int i = start; i <nums.length; i++){
            //add element
            resultList.add(nums[i]);
            //explore
            subsets(listOfSets, resultList, nums, i+1);
            //remove
            resultList.remove(resultList.size()-1);
        }
    }

    //##########FINAL SOLUTION BUT NAIVE APPROACH USING RECURSION AND BACKTRACKING########
    static void subsetRecursiveSolution(int[] nums, HashSet<Integer> resultList, int start){
        //base case when array becomes empty
        if(start==nums.length){
            if(!hashOfHash.contains(resultList)){
                hashOfHash.add(resultList.toString());
                finalListofList.add(resultList.stream().collect(Collectors.toList()));
            }
            return;
        }

        //2 recursive calls -> either to take element or not take it
        int curr_element = nums[start];
        resultList.add(curr_element);  //add element
        subsetRecursiveSolution(nums, resultList, start+1);

        resultList.remove(curr_element); //remove element
        subsetRecursiveSolution(nums, resultList, start+1); //back track after removing element
    }

    //########OPTIMIZE ABOVE SOLUTION USING DYNAMIC PROGRAMMING ################################
}


//class Solution {
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> output = new ArrayList();
//        output.add(new ArrayList<Integer>());
//
//        for (int num : nums) {
//            List<List<Integer>> newSubsets = new ArrayList();
//            for (List<Integer> curr : output) {
//                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
//            }
//            for (List<Integer> curr : newSubsets) {
//                output.add(curr);
//            }
//        }
//        return output;
//    }
//}
