public static int birthdayCakeCandles(List<Integer> candles) {
     int arr[]=new int[candles.size()];
     for(int i=0;i<candles.size();i++)
     {
         arr[i]=candles.get(i);
     }
     Arrays.sort(arr);
     int sum=0;
     int max=arr[arr.length-1];
     for(int i=arr.length-1;i>=0;i--)
     {
         if(arr[i]==max)
         {
             sum=sum+1;
         }
     }
     return sum;

    }
