class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subfind(result,new ArrayList<Integer>(), 0, nums);
        return result;
        
    }
    
    public void subfind(List<List<Integer>> result, List<Integer> templist, int start, int[] nums)
    {
        result.add(new ArrayList<>(templist));
        for(int i = start;i<nums.length;i++)
        {
            templist.add(nums[i]);
            subfind(result,templist,i+1,nums);
            //This statement is used to remove the element whose all the subsets has been found.
           templist.remove(templist.size()-1);
        }
    }
}