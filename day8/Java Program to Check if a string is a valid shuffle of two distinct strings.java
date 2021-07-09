package dsa;

import java.util.Arrays;

public class ShuffleCheck {
	public static boolean checkanagram(String s4,String s3)
	{
		char[] ch4=s4.toCharArray();
		char[] ch3=s3.toCharArray();
		Arrays.sort(ch3);
		Arrays.sort(ch4);
		for(int i=0;i<ch4.length;i++)
		{
			if(ch4[i]!=ch3[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		String s1="nandini";
		String s2="awtani";
		String s4=s1+s2;
		String s3="awnatandniint";
		if(s3.length()!=s1.length()+s2.length())
		{
			System.out.print(false);
			return;
		}
		boolean k=checkanagram(s4,s3);
		System.out.print(k);
	}

}
