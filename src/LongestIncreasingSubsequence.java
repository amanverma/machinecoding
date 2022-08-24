

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        //sort elements and traverse once  to find longest subsequence
        //
        int max_length = 0;
        int curr_length = 0;
        int j=0;
        for(int i =0; i< nums.length; i++){
            if(nums[i]>nums[j]){
                curr_length++;
                j++;
                if(curr_length>max_length){
                    max_length= curr_length;
                }
                continue;
            }
            curr_length=0;
        }

        return max_length;



    }

    public static void main(String[] args){
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
}
