package ds_algo.problems;

import java.util.Arrays;

public class houseRobber {
    int[] cache;
    public int rob(int[] nums) {
        //a[i] x-> a[i-1], a[i+1]
        //recursive ds_algo.problems.solution
        //either the robber would rob the house or not -> 2 choices
            //if robber robs , he would have to skip next house.
        this.cache = new int[100];
        Arrays.fill(this.cache,-1);
        return robFrom(0,nums);
    }

    private int robFrom(int i, int[] nums) {
        if(i>=nums.length){
            return 0;
        }
        if(this.cache[i]>-1){
            return this.cache[i];
        }
        int res =  Math.max((robFrom(i+1, nums)),(robFrom(i+2,nums)+nums[i]));
        this.cache[i] = res;
        return  res;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3,1};
        houseRobber houseRobber = new houseRobber();
        System.out.println(houseRobber.rob(nums));
        System.out.println("Below is DP Solution");
        System.out.println(robDP(nums));
        System.out.println("Below is Optimized DP Solution");
        System.out.println(robDPOptimized(nums));
    }


    //DP Solution without recursion - start from last house.
    public static int robDP(int[] nums){
        int N = nums.length;
        if(N==0) return 0;
        //create cache
        int[] cache = new int[N+1];
        //Base case
        cache[N] = 0;
        cache[N-1] = nums[N-1];

        for(int i = N-2; i>=0; i--){
            cache[i] = Math.max(cache[i+1], cache[i+2]+nums[i]);
        }
        return cache[0];

    } //O(N) time and O(N) space


    //Optimize DP Solution - O(N) time and O(1) space
    public static int robDPOptimized(int[] nums){
        int N = nums.length;
        if(N==0) return 0;
//        //create cache
//        int[] cache = new int[N+1];

        //Base case
        int robNextPlus1=0;
        int robNext= nums[N-1];

        for(int i = N-2; i>=0; i--){
            int current = Math.max(robNext, robNextPlus1+nums[i]);
            robNextPlus1= robNext;
            robNext = current;
        }

        return robNext;

    }


    //What if houses are arranged in circle instead in single street in a row.?

}
