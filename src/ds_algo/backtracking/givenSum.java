package ds_algo.backtracking;

public class givenSum {
    public static void main(String[] args) {
//        int[] nums = new int[]{3, 34, 4, 12, 5, 2};
//        int sum = 9;
        int[] nums = new int[]{3, 34, 4, 12, 5, 2};
        int sum = 30;
        long start = System.nanoTime();
        System.out.println(checkSubset(nums, nums.length-1, sum));
        long end = System.nanoTime();
        System.out.println("total time: "+ (end-start));
    }

    private static boolean checkSubset(int[] nums, int len, int sum) {
        if(sum==0)
            return true;
        if(sum<0 || len<=0)
            return false;

        //bounded context condition -> if last element > sum then ignore
//        if(nums[len-1]>sum){
//            checkSubset(nums, len-1,sum);
//        }


        boolean isIncluded = checkSubset(nums, len-1, sum-nums[len]);
        boolean isExcluded = checkSubset(nums, len-1, sum);

        return isExcluded || isIncluded;

    }
}
