public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long arr1[]=new long[5];
    for(int i=0;i<5;i++)
    {
        arr1[i]=arr.get(i);
    }
    Arrays.sort(arr1);
    System.out.print(arr1[0]+arr1[1]+arr1[2]+arr1[3]+" ");
    System.out.print(arr1[4]+arr1[1]+arr1[2]+arr1[3]);

    }
