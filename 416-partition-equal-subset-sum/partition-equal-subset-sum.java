class Solution {
    public boolean canPartition(int[] nums) {
        int sum =0;
        for(int i = 0;i < nums.length;i++)
        {

            sum = sum + nums[i];
        }
        if (sum %2 != 0){
        return false;
             }
        int result = sum / 2;
        boolean[]dp = new boolean [result + 1];
        dp[0] = true;
         for(int j = 0;j < nums.length;j++)
         {
            int num = nums[j];
       
            for(int i =result;i>= num;i--)
            {
                 if (dp[i - num] == true) {
            dp[i] = true;
                 }
            }
        }
        return dp[result];
    }
}