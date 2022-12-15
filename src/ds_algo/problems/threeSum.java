package ds_algo.problems;//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
import java.util.stream.Collectors;

public class threeSum {
    /*Approaches
    * Approach 1 -> Sort the array.
    * */

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int[] nums2 = new int[]{};
        int[] nums3 = new int[]{0};
        List<List<Integer>> integerList = threeSum1(nums);
        List<List<Integer>> integerList2 = threeSum2(nums);
        List<List<Integer>> integerList3 = threeSum3(nums);
        integerList.stream().forEach(i->{
            System.out.println(i.toString());
        });

        System.out.println("SECOND APPROACH"+"\n");

        integerList2.stream().forEach(i->{
            System.out.println(i.toString());
        });

        System.out.println("THIRD APPROACH"+"\n");

        integerList3.stream().forEach(i->{
            System.out.println(i.toString());
        });
    }
    public static List<List<Integer>> threeSum1(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        List<List<Integer>> res = new ArrayList<>();

        //approach two pointers post sorting

        for(int i = 0 ; i < sortedList.size(); i ++){
            if(sortedList.get(i)>=0) break;
            if(i>0 && (sortedList.get(i)==sortedList.get(i+1))) i++;

            int left = i + 1;
            int right = sortedList.size()-1;
            while(left<right){
                int sum = sortedList.get(i) + sortedList.get(left) + sortedList.get(right);
                if(sum<0){
                    left++;
                }else if (sum>0){
                    right--;
                }
                else{
                    List<Integer> integerList = new ArrayList<>();
                    integerList.add(nums[i]);
                    integerList.add(nums[left++]);
                    integerList.add(nums[right--]);
                    res.add(integerList);
                    while(left<right && sortedList.get(left)==sortedList.get(left-1))
                        left++;
                }
            }
        }
        return res;

    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        //approach : hashmap based approach
        HashSet<Integer> set = new HashSet<>();
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

//        for(int i = 0 ; i<nums.length && nums[i]<=0; i++){
//            if(i==0|| nums[i-1]!=nums[i]){
//                twoSum2(nums, i , res);
//            }
//        }

        for(int i = 0 ; i <nums.length; i ++){
            if(nums[i] >= 0) break;
            if(nums[i]!=nums[i+1] && i+1<nums.length) {
                for(int j = i+1 ; j< nums.length; j++ ){
                    int complement = -nums[i] - nums[j];
                    if(set.contains(complement)){
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], complement));
                        Collections.sort(list);
                        res.add(list);
                        while(j+1<nums.length && nums[j]==nums[j+1]) j++;
                    }
                    set.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(res);
    }

//    private static void twoSum2(int[] nums, int i, List<List<Integer>> res) {
//        HashSet<Integer> set = new HashSet<>();
//        for(int j = i+1 ; j< nums.length; j++ ){
//            int complement = -nums[i] - nums[j];
//            if(set.contains(complement)){
//                List<Integer> list
//                res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], complement)));
//
//                while(j+1<nums.length && nums[j]==nums[j+1]) j++;
//            }
//            set.add(nums[j]);
//        }
//    }

    public static List<List<Integer>> threeSum3(int[] nums) {
        //No sort method
        //Approach - use two sets, one map
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<List<Integer>> set2 = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            set1.add(i);
            for (int j = i+1; j< nums.length; j++){
                int complement = -nums[i] -nums[j];
                if(map.containsKey(complement) && map.get(complement)==i){
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], complement));
                    Collections.sort(list);
                    set2.add(list);
                }else{
                    map.put(nums[j],i);
                }
            }
        }

        return new ArrayList<>(set2);
    }


    //two sum
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            if(left==left+1) left++;
            if(numbers[left]+numbers[right]==target) return new int[]{numbers[left], numbers[right]};
            else if(numbers[left]+numbers[right]<target) left++;
            else if(numbers[left]+numbers[right]>target) right--;

        }
        return new int[]{};

    }

    public int twoSumLessThanK(int[] numbers, int k) {
        int left = 0;
        int right = numbers.length-1;
        int max_sum = 0;
        Arrays.sort(numbers);
        while(left<right){
            if(left==left+1) left++;
            int sum = numbers[left]+ numbers[right];
            if(sum<k) {
                if(max_sum<sum) max_sum = sum;
                left++;
            }
            else if(sum>k) right--;

        }
        return max_sum;

    }

    //without sorting
    //cannot use hashmap

    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int numberOfTriplets = 0;

        for(int i = 0; i < nums.length; i ++){
            int left = i+1;
            int right = nums.length-1;
            int complement = target-nums[i];
            //for each nums[i] fine twoSum s.t. their sum < complement
            numberOfTriplets += twoSumLessThanComplement(nums, i, complement);

        }
        return numberOfTriplets;

    }

    public static int twoSumLessThanComplement(int[] numbers, int start_index, int k) {
        int left = start_index;
        int right = numbers.length-1;
        int count = 0;
        while(left<right){
            int sum = numbers[left]+ numbers[right];
            if(sum<k) {
                count+=right-left;
                left++;
            }
            else right--;

        }
        return count;

    }


    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sumOfThree = 0;
        int size = nums.length;
        for(int i = 0; i < size; i++){
            int diff = target-nums[i];
            int left = i+1;
            int distance =Integer.MAX_VALUE;
            int minimum_Distance = Integer.MAX_VALUE;
            int right = size-1;
            //return sum of a,b,c in nums such that diff is minimum
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                int difference = target- sum;
                if(Math.abs(diff)<Math.abs(difference)){
                    diff = difference;
                }
                if(sum<target) left++;
                else right  --;
            }
        }
        return sumOfThree;
    }

}
