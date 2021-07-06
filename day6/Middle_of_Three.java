class Solution{
    int middle(int A, int B, int C){
        //code here
        int i=Math.max(A,B);
        int maxf=Math.max(i,C);
       int f=Math.min(A,B);
       int minf=Math.min(f,C);
       
       if(A<maxf && A>minf)
       return A;
       if(B<maxf && B>minf)
       return B;
       if(C<maxf && C>minf)
       return C;
       return minf; 
    }
}
