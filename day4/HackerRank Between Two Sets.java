public static boolean parta(List<Integer> a,int k)
     {
         for(int i=0;i<a.size();i++)
         {
             if(k%a.get(i)!=0)
                return false;
         }
         return true;
     } 
     public static boolean partb(List<Integer> b,int k)
     {
         for(int i=0;i<b.size();i++)
         {
             if(b.get(i)%k!=0)
                return false;
         }
         return true;
     }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    Collections.sort(a);
    Collections.sort(b);
    int count=0;
    int i=a.get(a.size()-1);
    while(i<=((b.get(0)/2)))
    {
       boolean a1= parta( a, i);
        boolean b1=partb( b, i);
        if(a1&&b1)
            count=count+1;
        i++;
    }
        boolean a1= parta( a, b.get(0));
        boolean b1=partb( b, b.get(0));
        if(a1&&b1)
            count=count+1;    
    return count;
    }
