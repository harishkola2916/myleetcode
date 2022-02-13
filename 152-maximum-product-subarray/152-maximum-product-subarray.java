class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0)
            return 0;
        int curMax = nums[0];
        int curMin = nums[0];
        int result = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                curMax = 1;
                curMin = 1;
            }
            int temp = nums[i]*curMax;
            curMax = Math.max(nums[i]*curMax, Math.max(nums[i]*curMin, nums[i]));
            curMin = Math.min(temp, Math.min(nums[i]*curMin, nums[i]));
            
            result = Math.max(result,curMax);
        }
        
        
      return result;  
    }
}