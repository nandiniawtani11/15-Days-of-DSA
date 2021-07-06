package dsa;
public class reverseArray {
	public static int[] reverse(int[] arr,int start,int end)
	{
		if(start>=end)
			return arr;
		int temp=0;
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		return reverse(arr,start+1,end-1);
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		int [] rev=reverse(arr,0,4);
		for(int i=0;i<5;i++)
		System.out.print(rev[i]);	
	}
}
