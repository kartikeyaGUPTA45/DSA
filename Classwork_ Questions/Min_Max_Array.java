import java.io.*;
import java.util.*;

public class Solution {
    public static int maxOfArray(int arr[]){
        int max = arr[0];
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        return max;
    }
    
    public static int minOfArray(int arr[]){
        int min = arr[0];
        int n =arr.length;
        
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        
        return min;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int min = minOfArray(arr);
        int max = maxOfArray(arr);
        int span = max-min;
        System.out.println(span);
    }
}
