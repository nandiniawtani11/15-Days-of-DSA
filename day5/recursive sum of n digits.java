package dsa;
import java.util.*;

public class sumofdigits {
	
	public static int sum(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			 return sum(n-1)+n;			
	}
	public static void main(String[] args)
	{
		int i=sum(4);
		System.out.println(i);	
	}
	

}
