class Solution {
    public String removeKdigits(String num, int k) {
        
        if(k == 0)
            return num;
        
        if(k == num.length())
            return "0";
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<num.length();i++){
            while(k>0 && !st.isEmpty() && (st.peek()-'a') > (num.charAt(i)-'a')){
                k--;
                st.pop();
            }
            st.push(num.charAt(i));            
        }
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        
        StringBuilder s = new StringBuilder();
        while(!st.isEmpty()){
            s.append(st.pop());
        }
        
        System.out.println(" bui "+s.toString());
        
        s.reverse();
        
        while(s.toString().startsWith("0"))
        {
           s.deleteCharAt(0); 
        }
            
    return s.length() == 0 ? "0" : s.toString();
    }
}