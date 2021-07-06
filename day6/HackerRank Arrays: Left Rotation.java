 public static List<Integer> rotLeft(List<Integer> a, int d) {
    // Write your code here
      List<Integer> temp=new ArrayList<Integer>();
    for(int i=0;i<a.size();i++){
        temp.add(i,a.get(i));
        }
        int n=a.size();
        for(int i=0;i<n-d;i++){
            a.set(i,a.get(i+d));
        }
        int index=0;
        for(int j=n-d;j<n;j++){
            a.set(j,temp.get(index));
            index++;
        }
    return a;

    }
