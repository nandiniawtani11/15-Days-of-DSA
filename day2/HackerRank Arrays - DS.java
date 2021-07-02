public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    int s=a.size();
    List<Integer> list=new ArrayList<Integer>(s);
    for(int i=s-1;i>=0;i--)
    {
        list.add(a.get(i));
    }
    return list;
    }

}
