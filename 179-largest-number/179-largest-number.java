import java.util.Comparator;
class Solution {
    public String largestNumber(int[] nums) {
        
        String[] arrayOfStr = new String[nums.length];
        
        for(int i=0;i<nums.length;i++){
            arrayOfStr[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(arrayOfStr, new Comparator<String>(){ 
            
            @Override
            public int compare(String a, String b){
                String s1= a+b;
                String s2 = b+a;
                return s2.compareTo(s1);
            }
            
        });
        
        if(arrayOfStr[0].equals("0"))
            return "0";
        
        StringBuilder numberStr = new StringBuilder();
        for(String num: arrayOfStr){
            numberStr.append(num);
        }
        
        return numberStr.toString();
    }
                
}