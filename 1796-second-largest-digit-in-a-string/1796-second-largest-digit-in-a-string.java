class Solution {
    public int secondHighest(String s) {
        int first  = -1;
        int second = -1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int digit = s.charAt(i) - '0';
                if(digit>first){
                    second = first;
                    first = digit;
                }
                else if(digit < first && second < digit){
                    second = digit;
                }
            }
        }
        return second;
    }
}