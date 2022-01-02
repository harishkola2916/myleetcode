class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int indexOfM = m-1 ;
        int indexOfN = n-1;
        int indexOfFull = m+n-1;
        // the idea is to fill elements from back because the last elements in nums1 are 0's and we can avoid overriding of values
        while(indexOfM >= 0 && indexOfN>=0)
        {
            if(nums1[indexOfM] >= nums2[indexOfN])
            {
                nums1[indexOfFull] = nums1[indexOfM];
                indexOfM--;
            }
            else
            {
                nums1[indexOfFull] = nums2[indexOfN];
                indexOfN--;
            }
            indexOfFull--;
        }
        // if indexOfM reaches to 0 but indexOfN doesn't that means there is still possiblity of having numbers         //in nums2 array and obviously they must be smaller than nums1 we can copy those to nums1
       // ex: nums1 = [7,8,9,0,0,0] nums2 = [1,2,3]
        while(indexOfN>=0)
        {
            nums1[indexOfFull] = nums2[indexOfN];
            indexOfFull--;
            indexOfN--;
        }
    }
}