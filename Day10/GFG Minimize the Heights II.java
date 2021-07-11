class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        
        Arrays.sort(arr);
        
        int ans = arr[n-1] - arr[0];
        
        int small = arr[0] + k;
        int big = arr[n-1] - k;
        
        int min ;
        int max;
        for(int i = 1; i<= n-1; i++)
        {
            if(arr[i] >=k)
            {
                min = Math.min(arr[i]-k,small);
                max = Math.max(arr[i-1]+k, big);
                ans = Math.min(ans, max-min);
            }
            else 
            continue;
        }
        
        return ans;
    }
}
