  public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int count=0;
    for(int i=0;i<apples.size();i++)
    {
        int dis=apples.get(i)+a;
        if(dis>=s && dis<=t)
            count=count+1;
    }
    System.out.println(count);
    count=0;
     for(int i=0;i<oranges.size();i++)
    {
        int dis=oranges.get(i)+b;
        if(dis>=s && dis<=t)
            count=count+1;
    }
    System.out.println(count);
    }
