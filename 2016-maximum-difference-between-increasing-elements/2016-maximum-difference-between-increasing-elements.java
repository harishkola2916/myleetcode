class Solution {
    public int maximumDifference(int[] nums) {
        if(nums.length<2 && nums.length>1000)
            return -1;
        int maxDiff = -1;
        int second = nums[0];
        for(int i=1;i<nums.length;i++)
        {
             maxDiff = Math.max(maxDiff,nums[i]-second);
             second = Math.min(nums[i],second);
        }
        return maxDiff==0?-1:maxDiff;
    }
}