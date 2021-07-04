public static List<Integer> breakingRecords(List<Integer> scores) {
    List<Integer> list=new ArrayList<Integer>();
    list.add(0);
    list.add(0);
    int max=scores.get(0);
    int min=scores.get(0);
    int i=1;
    while(i<scores.size())
    {
        int x=scores.get(i);
        if(x>max)
        {
            max=x;
            int k=list.get(0);
            list.set(0,k+1);
        }   
        if(x<min)
        {
            min=x;
            int j=list.get(1);
            list.set(1,j+1);
        }
        i++;
    }
    return list;
    }
