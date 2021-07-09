class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1)
        {
            System.out.print(nums[0]);
            return;
        }
        if(k>nums.length)
        {
            int g=k/nums.length;
            k=k-g*nums.length;
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        int i=0;
        int t=k;
        int len=nums.length;
        while(k>0)
        {
            nums[i]=nums[len-k];
            k--;
            i++;
        }
        int n=i;
        int l=0;
        for(n=i;n<len;n++)
        {
            nums[n]=arr[l];
            l++;
        }
        for(i=0;i<len;i++)
            System.out.print(nums[i]);
    }
}
