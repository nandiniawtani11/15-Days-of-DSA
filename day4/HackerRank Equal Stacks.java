public static List<Integer> reverse(List<Integer> h)
     {
         Stack<Integer> stack=new Stack<Integer>();
         for(int i=0;i<h.size();i++)
         {
             stack.push(h.get(i));
         }
         for(int i=0;i<h.size();i++)
         {
             int k=stack.pop();
             h.set(i,k);
         }
         
         for(int i=1;i<h.size();i++)
         {
             int y=h.get(i)+h.get(i-1);
             h.set(i,y);
         }
         
         
         
         return h;
     }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    // Write your code here
    reverse(h1);
    reverse(h2);
    reverse(h3);
    if(h1.size()<h2.size() && h1.size()<h3.size())
    {
        int i=h1.size()-1;
        while(i>=0)
        {
            int f=h1.get(i);
            if(h2.contains(f) && h3.contains(f) )
            {
                return f;
            }
            i--;
        }
    }
    else if(h1.size()>h2.size() && h2.size()<h3.size())
    {
        int i=h2.size()-1;
        while(i>=0)
        {
            int f=h2.get(i);
            if(h1.contains(f) && h3.contains(f) )
            {
                return f;
            }
            i--;
        }
    }
     else
    {
        int i=h3.size()-1;
        while(i>=0)
        {
            int f=h3.get(i);
            if(h2.contains(f) && h1.contains(f) )
            {
                return f;
            }
            i--;
        }
    }  
    return 0; 
    }
