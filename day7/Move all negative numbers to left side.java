package dsa;

public class OneSideNegative {
	public static void main(String[] args)
	{
		int arr[]= {-1,3,-5,4,-6,3,-7,2,66,-7};
		int j=0;
		while(j<10)
		{
			for(int i=1;i<10;i++)
			{
				if(arr[i]<0)
				{
					int k=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=k;
				}
			}
			j++;	
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
