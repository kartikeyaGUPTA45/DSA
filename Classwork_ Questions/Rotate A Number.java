import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int k =scn.nextInt();
        
        int num = n;
        int count=0;
        while(num>0){
            count+=1;
            num/=10;
        }
        
        k=k%n;
        if(k<0){
            k+=n;
        }
        
        int a=1;
        int b=1;
        
        for(int i=0;i<count;i++){
            if(i<k){
                a*=10;
            }else{
                b*=10;
            }
        }
        
        int quotient = n/a;
        int remainder = n%a;
        
        int finalNumber = remainder*b+quotient;
        System.out.println(finalNumber);
    }
}
