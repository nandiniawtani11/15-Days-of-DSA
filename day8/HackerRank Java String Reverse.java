import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder str=new StringBuilder();
        str.append(A);
        str.reverse();
        String c=str.toString();
        if(c.compareTo(A)==0)
        {
            System.out.print("Yes");
        }
        else
        System.out.print("No");     
    }
}



