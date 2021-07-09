class Solution {
    public int check(int k)
    {
        int h=k%10;
        int f=k;
        while(k>0)
        {
            if(h==0)
                return 0;
            if(f%h!=0)
                return 0;
            k=k/10;
            h=k%10;           
            
        }
        return f;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<Integer>(); 
        for(int i=left;i<=right;i++)
        {
            int j=check(i);
            if(j!=0)
                list.add(i);
        }
        return list;
    }
}
