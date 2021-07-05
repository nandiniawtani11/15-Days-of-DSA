package dsa;

public class GCD {
	public static int gcd(int a,int b,int c)
	{
		int i=c;
		if(a%i==0 && b%i==0)
			return i;
		else
			return gcd(a,b,c-1);
	}
	public static void main(String[] args)
	{
		int a=18;
		int b=48;
		int c=a;
		int h=(gcd(a,b,c));
		System.out.println(h);
		
	}

}
