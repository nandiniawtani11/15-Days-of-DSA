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
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>(k);
        for(int i=0;i<k;i++)
        {
            int d=sc.nextInt();
            ArrayList<Integer> a1=new ArrayList<Integer>(d);
            for(int j=0;j<d;j++)
            {
                int h=sc.nextInt();
                a1.add(h);
            }
            arr.add(a1);
        }
        int q=sc.nextInt();
        while(q-->0)
        {
            int i=sc.nextInt();
            int l=sc.nextInt();
            if(l<=arr.get(i-1).size())
            {
                System.out.println((arr.get(i-1)).get(l-1));
            }
            else
            {
                System.out.println("ERROR!");
            }
            
        }
        
        
        
    }
}
