import java.io.*;
import java.util.*;

public class Solution {
    
    public static int firstIndex(int arr[], int idx, int  x){
        
        if(idx == arr.length) return -1;
        
        if(arr[idx] == x) return idx;
        else{
            return firstIndex(arr,idx+1, x);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] =new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int x = scn.nextInt();
        
        int ans = firstIndex(arr, 0, x);
        System.out.println(ans);
    }
}
