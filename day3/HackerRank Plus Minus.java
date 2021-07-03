 public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int pos=0;
    int neg=0;
    int zero=0;
    int s=arr.size();
    for(int i=0;i<arr.size();i++)
    {
        if(arr.get(i)>0)
        {
             pos=pos+1;
        }
        else if(arr.get(i)<0)
        {
             neg=neg+1;
        }
        else{
            zero=zero+1;
        }
    }
    System.out.println(pos/(double)s);
    System.out.println(neg/(double)s);
    System.out.println(zero/(double)s);
    }
