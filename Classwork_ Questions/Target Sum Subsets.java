import java.io.*;
import java.util.*;

public class Solution {
    
    public static void tss(int arr[] , int idx , String asf , int ssf , int tar){
        if(ssf > tar) {
            return ;
        }
        
        if(idx == arr.length){
            if (ssf == tar){
                System.out.println(asf+".");
            }
            
            return ;
        }
        
        
        tss(arr,idx+1,asf+arr[idx]+", ",ssf+arr[idx],tar);
        tss(arr,idx+1,asf,ssf,tar);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int tar = scn.nextInt();
        tss(arr,0,"",0,tar);
    }
}
