import java.io.*;
import java.util.*;

public class Solution {
    
    public static int factorial(int n){
        
        if(n == 0) return 1;
        
        int subAns = factorial(n-1);
        
        int myAns = n*subAns;
        return myAns;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int ans = factorial(n);
        System.out.println(ans);
    }
}
