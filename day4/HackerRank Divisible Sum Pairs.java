  public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    int count=0;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if((ar.get(i)+ar.get(j))%k==0)
                count =count+1;
        }
    }
    return count;

    }
