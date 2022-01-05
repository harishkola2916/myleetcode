class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<numbers.length && j>=0)
        {
            if(numbers[i]+numbers[j] > target)
            {
                j--;
            }
            else if(numbers[i]+numbers[j] < target)
            {
                i++;
            }
            else if(numbers[i]+numbers[j] == target)
            {
                return new int[]{i+1,j+1};
            }
        }
        return null;
    }
}