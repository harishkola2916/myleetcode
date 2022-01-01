class Solution {
    public int findNumbers(int[] nums) {

        int oddEven = 0;
        for(int i=0;i<nums.length;i++)
        {
            int number = nums[i];
            int count = 1;
            while(number/10 > 0)
            {
                count++;
                number = number/10;          
            }
            if(count%2 == 0)
            {
                oddEven++;
            }
        }
        return oddEven;
    }
}