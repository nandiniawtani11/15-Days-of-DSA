package dsa;

public class RoatationCheck {
	public static void main(String[] args)
	{
		String s1="ABCl";
		String s2="CDAB";
		char ch=s1.charAt(0);
		int k=s2.indexOf(ch);
		for(int i=0;i<s2.length();i++)
		{
			if(Math.abs(s2.indexOf(s1.charAt(i))-i) !=k)
			{
				System.out.print("false");
				return;
			}		
		}
		System.out.print("true");
	}
}
