import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkPrime(int n){
        if(n == 1) return false;
        
        for(int i=2;i*i<=n;i++){
            if(n%i == 0) return false;
        }
        
        return true;
    }

    public static int countOfPrimeSubarrays(int arr[]){
        int ans =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sizeOfSubarray = j-i+1;
                if(checkPrime(sizeOfSubarray)) ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        System.out.println(countOfPrimeSubarrays(arr));
    }
}
