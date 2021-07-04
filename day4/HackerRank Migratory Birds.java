import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class NewClass4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
            {
                int val=map.get(arr[i])+1;
                map.put(arr[i],val);
            }
        }
        List<Integer> list=new ArrayList<>();
        int maxValueInMap=(Collections.max(map.values())); 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        { 
            if (entry.getValue()==maxValueInMap) 
                list.add(entry.getKey());     
        }
        System.out.print(Collections.min(list));
    }
}
