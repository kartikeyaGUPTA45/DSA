import java.io.*;
import java.util.*;

public class Solution {
    public static int linearPower(int x,int n){
        if(n == 0) return 1;
        
        
        int subAns = linearPower(x,n-1);
        
        int ans = x*subAns;
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = linearPower(x,n);
        System.out.println(ans);
    }
}
