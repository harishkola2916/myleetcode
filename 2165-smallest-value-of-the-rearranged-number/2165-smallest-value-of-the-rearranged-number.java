class Solution {
    public long smallestNumber(long num) {
        
        if(num == 0)
            return 0;
        
        char[] numchar = String.valueOf(Math.abs(num)).toCharArray();
        
        Arrays.sort(numchar);
        
        // if number is negative, sort the numbers, reverse and add sign
        if(num<0)
            return -Long.parseLong(new StringBuilder(new String(numchar)).reverse().toString());
        
        // checking for first non-zero number
        int i=0;
        while(numchar[i] == '0'){
            i++;
        }
        
        char temp = numchar[0];
        numchar[0] = numchar[i];
        numchar[i] = temp;
        
        return Long.parseLong(new String(numchar));
        
    }
}