import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        
        int ans=0,power=1,carry=0;
        
        while(n1>0 || n2>0 || carry>0){
            int ld1=n1%10;
            int ld2=n2%10;
            
            int add = ld1+ld2+carry;
            ans=ans+power*(add%b);
            carry = add/b;
            
            n1/=10;
            n2/=10;
            
            power*=10;
        }
        
        System.out.println(ans);
    }
}
