class Solution {
    public int titleToNumber(String columnTitle) {
        // A to Z is 26 letters
        // A == 1, Z == 26
        // AA == 1*26+1 = 27
        // AB == 1*26+2 = 28
        // ZY == 26*26+25 = 701
        // ZZY = 26^2*26+26^1*26+26^0
        
        /*
            "B" = 2
            "BC" = (2)26 + 3
            "BCM" = (2(26) + 3)26 + 13
        */
        if(columnTitle == null || columnTitle.length() == 0)
            return 0;
        int power = columnTitle.length()-1;
        int sum = 0;
        int index = 0;
        while(power>=0)
        {
            sum += Math.pow(26,power)*(columnTitle.charAt(index)-'A'+1);
            power--;
            index++;
        }
        return (sum);
    }
}