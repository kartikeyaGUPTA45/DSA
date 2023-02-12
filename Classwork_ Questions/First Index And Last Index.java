import java.io.*;
import java.util.*;

public class Solution {
    
    public static int findLastIndex(int arr[],int d){
        int n =arr.length;
        for(int i =n-1;i>=0;i--){
            if(arr[i] == d){
                return i;
            }
        }
        
        return -1;
    }
    
    public static int findFirstIndex(int arr[],int d){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == d){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int d=scn.nextInt();
        
        int firstIndex = findFirstIndex(arr,d);
        int lastIndex = findLastIndex(arr,d);
        
        System.out.println(firstIndex);
        System.out.println(lastIndex);
    }
}
