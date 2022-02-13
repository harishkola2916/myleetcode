class Solution {
    public boolean validMountainArray(int[] arr) {
        
        if(arr.length < 3)
            return false;
        
        boolean result = true;
        int i = 0;
        int len = arr.length;
        while(i+1<len && arr[i]<arr[i+1])
        {
            i++;
        }
        if(i == 0 || i == len-1)
            return false;
        while(i+1 < len && arr[i]>arr[i+1])
        {
            i++;
        }
        
        return i == len-1;
        
    }
}