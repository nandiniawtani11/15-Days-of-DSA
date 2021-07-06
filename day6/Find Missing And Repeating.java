class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
       int ans[]=new int[n+1];
        
        Arrays.fill(ans,0);
        ans[0]=1;
        for(int i=0;i<n;i++)
        {
            ans[arr[i]]++;
        }
        
        int final_ans[]=new int[2];
        for(int i=1;i<ans.length;i++)
        {
            if(ans[i]==0)
            final_ans[1]=i;
            if(ans[i]>=2)
            final_ans[0]=i;
        }
        return final_ans;
    }
}
