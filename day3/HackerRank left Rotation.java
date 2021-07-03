 public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
     List<Integer> temp=new ArrayList<Integer>();
    for(int i=0;i<arr.size();i++){
        temp.add(i,arr.get(i));
        }
        int n=arr.size();
        for(int i=0;i<n-d;i++){
            arr.set(i,arr.get(i+d));
        }
        int index=0;
        for(int j=n-d;j<n;j++){
            arr.set(j,temp.get(index));
            index++;
        }
    return arr;

    }
