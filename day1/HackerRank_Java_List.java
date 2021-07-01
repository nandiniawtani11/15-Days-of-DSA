import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        ArrayList<Integer> list=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());//list
        }
        int q=sc.nextInt();//2
        
        while(q-->0)
        {
            String s=sc.next();//insert
           
            int i=sc.nextInt();
            if(s.equals("Insert"))
            {
                //x
                int val=sc.nextInt();//y
                list.add(i,val);
            }
            else
            {
                list.remove(i);
            }
        }
        for(int p=0;p<list.size();p++)
        {
            System.out.print(list.get(p)+" ");
        }
        
      }
}
