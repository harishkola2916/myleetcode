class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
        {
            return nums[0];
        }
        for(int i=1;i<nums.length;i++)
        {
                currentSum = Math.max(nums[i],currentSum+nums[i]);
                    maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
        
    }
}