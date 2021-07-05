import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();            
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
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
        Set<Map.Entry<Integer,Integer>> s=map.entrySet();
        for(Map.Entry<Integer,Integer> it:s)
        {
            int k=it.getValue();
            if(k%2==0 || k%2>0)
                count=count+(k/2); 
        }
        System.out.println(count); 
    } 
}
