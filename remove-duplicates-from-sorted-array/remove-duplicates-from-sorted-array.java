class Solution {
    public int removeDuplicates(int[] nums) {
        int resIndex = 1; // since the firs element is used to compare the next item, we will start copying                 //elements at the next index(from index 1)
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]) // checking for different elements, if they are different, copy the element to                  //the index of result array;
            {
                nums[resIndex] = nums[i];
                resIndex++;
            }
        }
        return resIndex;
    }
}