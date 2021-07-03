 public static void staircase(int n) {
    int i=0;
    int k=0;
    int j=0;
    while(i<n)
    {
        k=n-1;
        while(j<k-i)
        {
            System.out.print(" ");
             j++;
        }
        while(j>=k-i && j<n)
        {
            System.out.print("#");
             j++;
        }
        System.out.println();
       j=0;
        i++;
    }
    }
