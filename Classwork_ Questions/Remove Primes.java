import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i == 0) return false;
        }
        
        return true;
    }
    
    
    public static void removePrime(ArrayList<Integer>arr){
        for(int i=arr.size()-1;i>=0;i--){
            if(checkPrime(arr.get(i))){
                arr.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int x = scn.nextInt();
            arr.add(x);
        }
        
        removePrime(arr);
        System.out.println(arr);
    }
}
