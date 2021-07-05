package dsa;
public class decimalToBinary {
	static String s="";
	public static String binary(int n)
	{
		if(n==0)
			return s;		
			if(n%2==0)
				s= "0"+s;
			else if(n%2!=0)
				s= "1"+s;
		return binary(n/2);	
	}
	public static void main(String[] args)
	{
		String k=binary(11);
		System.out.println(k);
	}
}
