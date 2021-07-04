public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> list=new ArrayList<>();
    int t=0;
    for(int i=0;i<grades.size();i++)
    {
        t=grades.get(i);
         if(t>=38)
        {
            int n=t/5;
            int k=(5*(n+1))-t;
            if(k<3)
            t=(n+1)*5;
        }
        list.add(t);
    }
    return list;
    }
