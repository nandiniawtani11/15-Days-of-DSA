public static int jumpingOnClouds(List<Integer> c) {
    int count=0;
    int i=0;
    for( i=0;i<c.size()-2;i++)
    {
            if(c.get(i+2)==0)
            {
                if(i==c.size()-4)
                {
                    i=i+2;
                    count=count+1;
                    break;
                }
                else
                    i=i+1;   
            } 
        count=count+1;          
    }
    if(i==c.size()-2)
    count=count+1; 
    return count;
    }
