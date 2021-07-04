public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
    int sum=0;
    for(int i=0;i<bill.size();i++)
    {
        if(i!=k)
        {
            sum=sum+bill.get(i);
        }
    }
    sum=sum/2;
    if(sum==b)
    System.out.print("Bon Appetit");
    else
    System.out.print(Math.abs(sum-b));

    }
