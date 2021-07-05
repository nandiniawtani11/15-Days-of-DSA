public static long repeatedString(String s, long n) {
        boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='a')
            {
                flag=false;
                break;
            }
        }
        if(flag)
        return n;
        int count=0;
        if(n<s.length())
        {
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='a')
                count=count+1;
            }
            return count;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            count=count+1;
        }
        long result=0;
        result=((n/s.length())*count);
        int k=(int)n%s.length();
        if(k!=0)
        {
            for(int i=0;i<k;i++)
            {
                if(s.charAt(i)=='a')
                result=result+1;
            }
            
        }
        return result;

}
