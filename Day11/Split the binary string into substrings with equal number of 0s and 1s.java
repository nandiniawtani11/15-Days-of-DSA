package dsa;

public class Equal1s {
	public static int check(String str)
	{
		int [] arr=new int[2];
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0')
				arr[0]=arr[0]+1;
			if(str.charAt(i)=='1')
				arr[1]=arr[1]+1;
			if(arr[0]==arr[1])
			{
				count=count+1;
				arr[0]=0;
				arr[1]=0;
			}
		}
		if(count==0)
		return -1;
		return count;
	}
	public static void main(String[] args)
	{
		String str="0000000000";
		int k=check(str);
		System.out.println(k);	
	}
}
