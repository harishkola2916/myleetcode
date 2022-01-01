class Solution {
    public int[] sortedSquares(int[] nums) {
        int j = nums.length-1; // right pointer
        int i = 0; //left pointer
        int[] res = new int[nums.length];  // new array to store result
        for(int k=nums.length-1;k>=0;k--)
        {
            if(Math.abs(nums[i]) > Math.abs(nums[j]))
             {
                res[k] = Math.abs(nums[i]*nums[i]);
                 i++;
             }
             else
               {
                  res[k] = Math.abs(nums[j]*nums[j]);
                   j--;
               }
        }
        return res;
    }
}
