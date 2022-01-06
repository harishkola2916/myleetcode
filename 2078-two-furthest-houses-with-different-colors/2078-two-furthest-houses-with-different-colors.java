class Solution {
    public int maxDistance(int[] colors) {
        if(colors.length<2 && colors.length>100)
            return 0;
                
        int i = 0;
        int j = colors.length-1;
        int n = colors.length;
        //find the last house of different color from the first house
        while(colors[0] == colors[j])
        {
            j--;
        }
        
        //find the first house of different color from the last house
        while(colors[n-1] == colors[i])
        {
            i++;
        }
        // returning max of these two options
        return Math.max(n-1-i,j);
    
    }
}