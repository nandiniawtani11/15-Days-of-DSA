package dsa;

public class reverseString {
	static String t="";
	public static String reverse(String s, int n)
	{
		
		if(n==0)
			return t;
		t=t+s.charAt(n-1) ;
			return reverse(s,n-1);
	}
	public static void main(String[] args)
	{
		String f="nandini";
		String y=reverse(f,7);
		System.out.println(y);
	}

}
