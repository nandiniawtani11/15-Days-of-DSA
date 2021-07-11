class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        int i=n-1;
        int j=0;
        while(i>=0 && j<m)
        {
            if(arr1[i]>arr2[j])
            swap(arr1,arr2,i,j);
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
      
    }
     public void swap(int[] arr1,int[] arr2,int i,int j)
       {
           int temp=arr1[i];
           arr1[i]=arr2[j];
           arr2[j]=temp;
       }
}
