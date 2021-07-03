 public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
    long sum=0;
    for(int i=0;i<ar.size();i++)
    {
        sum=sum+ar.get(i);
    }
    return sum;

    }
