class Solution {
    public char findTheDifference(String s, String t) {
        int sums=0;
        int sumt=0;
        for(int i=0;i<s.length();i++)
        {
            int k=s.charAt(i);
            sums=sums+k;
        }
        for(int i=0;i<t.length();i++)
        {
            int k=t.charAt(i);
            sumt=sumt+k;
        }
        int sumf=Math.abs(sums-sumt);
        char ch=(char)sumf;
        return ch;    
    }
}
