class Solution {
    public boolean isAnagram(String s, String t) {
        char[] anagrams = new char[26];
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            anagrams[s1[i]-'a']++;
            anagrams[t1[i]-'a']--;
        }
        for(int i=0;i<anagrams.length;i++)
        {
            if(anagrams[i] != 0)
            {
                return false;
            }
        }
        
        return true;
    }
}