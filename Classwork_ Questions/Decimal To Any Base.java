import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int base = scn.nextInt();
        
        int ans=0,power=1;
        
        while(n>0){
            int rem = n%base;
            ans+=power*rem;
            n/=base;
            power*=10;
            
        }
        
        System.out.println(ans);
    }
}
