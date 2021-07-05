package dsa;

public class product {
	static int i=1;
	public static int pro(int[] arr,int n) 
	{
		if(n==0)
			return i*arr[0];
		else
			i=i*arr[n-1];
		return pro(arr,n-1);
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		int k=pro(arr,5);
		System.out.println(k);
	}

}
