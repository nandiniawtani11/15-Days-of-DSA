 public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
    List<Integer> list=new ArrayList<>(2);
    int i=0;
    int suma=0;
    int sumb=0;
    while(i<3)
    {
        if(a.get(i)>b.get(i))
        {
            suma=suma+1;
        }
        else if(a.get(i)<b.get(i))
        {
            sumb=sumb+1;
        }
        i++;
    }
    list.add(suma);
    list.add(sumb);
    return list;
    }
