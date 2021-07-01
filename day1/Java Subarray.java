import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr=new int[k];
        int count =0;
        for(int i=0;i<k;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<k;i++)
        {
            int sum=0;
            for(int j=i;j<k;j++)
            {
                sum=sum+arr[j];
                if(sum<0)
                {
                    count++;
                }                
            } 
        }
        System.out.print(count);

    }
}
