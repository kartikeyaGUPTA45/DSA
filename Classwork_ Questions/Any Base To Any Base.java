import java.io.*;
import java.util.*;

public class Solution {
    
    public static int anyBaseToDecimal(int n,int b){
        int ans=0,power=1;
        
        while(n>0){
            int ld=n%10;
            ans=ans+ld*power;
            n/=10;
            power*=b;
        }
        
        return ans;
    }
    
    public static int decimalToAnyBase(int n,int b){
        int ans=0,power=1;
        
        while(n>0){
            int rem = n%b;
            ans+=rem*power;
            n/=b;
            power*=10;
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();
        
        int b1tod=anyBaseToDecimal(n,b1);
        int dtob2=decimalToAnyBase(b1tod,b2);
        
        System.out.println(dtob2);
    }
}
