class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        int count=0;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;int j=0;
        while(i<n && j<m)
        {
            if(i>0 && a[i]==a[i-1])
            {
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1])
            {
                j++;
                continue;
            }
            if(a[i]>b[j])
                j++;
            else if(a[i]<b[j])
            i++;
            else
            {
                i++;
                j++;
            }
            count=count+1;
        }
        if(i!=n)
        {
            
            for(int k=i;k<n;k++)
            {
                if(k>0 && a[k]==a[k-1])
                continue;
                else
                count=count+1;
            }
        }
        
        else if(j!=m)
        {
            for(int k=j;k<m;k++)
            {
                if(j>0 && b[k]==b[k-1])
                continue;
                else
                count=count+1;
            }
        }
            
        return count;
    }
}
