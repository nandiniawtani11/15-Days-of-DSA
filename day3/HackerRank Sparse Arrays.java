 public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    int count=0;
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<queries.size();i++)
    {
        for(int j=0;j<strings.size();j++)
        {
            if(queries.get(i).equals(strings.get(j)))
            {
                count=count+1;
            }
        }
        list.add(count);
        count=0;
    }
    return list;
      }
