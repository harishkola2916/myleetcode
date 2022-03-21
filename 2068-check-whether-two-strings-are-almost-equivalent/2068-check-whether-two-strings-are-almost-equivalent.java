class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        
        if(word1.length() != word2.length())
            return false;
        
        HashMap<Character,Integer> countMap = new HashMap<>();
        for(int i=0;i<word1.length();i++){
            countMap.put(word1.charAt(i),countMap.getOrDefault(word1.charAt(i),0)+1);
            countMap.put(word2.charAt(i),countMap.getOrDefault(word2.charAt(i),0)-1);
        }
        
        for(int i: countMap.values()){
            if(i>3 || i<-3){
                return false;
            }
        }
        return true;
    }
}