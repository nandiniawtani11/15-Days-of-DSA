class Solution
{
    static int majorityElement(int arr[], int size)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<size;i++)
    {
        if(!map.containsKey(arr[i]))
            map.put(arr[i],1);
        else
        {
            int k=map.get(arr[i])+1;
            map.put(arr[i],k);
        }
    }
    //System.out.println(map);
     Set<Map.Entry<Integer,Integer>> s=map.entrySet();
        for(Map.Entry<Integer,Integer> it:s)
        {
            if(it.getValue()>(size/2))
            return it.getKey();
        }
        return -1;
    }
}
