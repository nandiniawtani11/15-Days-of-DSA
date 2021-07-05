package dsa;

public class power {
	public static int power(int base,int pow)
	{
		if(pow==1)
		{
			return base;
		}
		return base*power(base,pow-1);
	}
	public static void main(String[] args)
	{
		int k=power(2,4);
		System.out.println(k);
	}

}
