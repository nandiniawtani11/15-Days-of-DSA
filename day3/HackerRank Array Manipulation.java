import java.util.Scanner;

public class Array_Manipulation {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();
        long[] arr = new long[n + 2];    

        while (t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int k = s.nextInt();
            arr[a] += k;        
            arr[b + 1] -= k;    
        }
        
        long res = 0;   
        for (int i = 1; i <= n; i++) {
            arr[i] += arr[i - 1];
            res = Math.max(arr[i], res);     
        }

        System.out.println(res);     

    }

}
