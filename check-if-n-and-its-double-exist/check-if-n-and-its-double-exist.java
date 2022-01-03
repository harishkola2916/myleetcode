class Solution {
    public boolean checkIfExist(int[] arr) {
        if(arr.length <= 2 && arr.length >= 500)
            return false;  
        HashSet<Integer> dup = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(dup.contains(2*arr[i]) || ((arr[i]%2==0) && dup.contains(arr[i]/2)))
                return true;
            
            dup.add(arr[i]);
            
        }

        return false;
    }
}