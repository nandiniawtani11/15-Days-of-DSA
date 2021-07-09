import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
    String a;
    int b;
    
    a = s.next(); 
    b = s.nextInt(); 
    
    int len = a.length()-b+1;   
    String[] A =new String[len];  
    
    String temp;
    for(int i=0;i<len;i++){
        A[i] = a.substring(i,i+b);  
    }
    
    Arrays.sort(A);
    System.out.println(A[0]);
    System.out.println(A[len-1]);
    }
}
