class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = nums.clone();
        for(int i=0;i<nums.length;i++)
        {
            // if(i+k < nums.length)
            // {
                nums[(i+k)%nums.length]  = temp[i];
            // }
            // else if(i+k > nums.length)
            // {
            //     nums[(i+k)-nums.length] = temp[i];
            // }
            // else if(i+k == nums.length)
            // {
            //     nums[i+k-1] = temp[i-1];
            // }
        }   
    }
}