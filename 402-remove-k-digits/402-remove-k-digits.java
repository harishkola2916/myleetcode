class Solution {
    public String removeKdigits(String num, int k) {
        
        StringBuilder sb =  new StringBuilder(num);
        
        if(k == 0)
            return num;
        
        if(k == num.length())
            return "0";
        
        while(k>0){
            int i=0; // everytime we compare 1st element with the second element and delete the second if it       //is greater than 1st
            while(i<sb.length()-1 && sb.charAt(i+1)>=sb.charAt(i)){
                i++;
            }
            sb.deleteCharAt(i);
            k--;
        }
        
        while(sb.toString().startsWith("0"))
        {
           sb.deleteCharAt(0); 
        }
            
    return sb.length() == 0 ? "0" : sb.toString();
    }
}