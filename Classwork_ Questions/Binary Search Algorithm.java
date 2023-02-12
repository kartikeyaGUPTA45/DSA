import java.io.*;
import java.util.*;

public class Solution {
    
    public static int binarySearch(int arr[],int d){
        
        int low=0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid] == d){
                return mid;
            }
            else if(arr[mid]>d){
                high = mid-1;
            }else {
                low=mid+1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int [n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int d = scn.nextInt();
        
        int index = binarySearch(arr,d);
        
        System.out.println(index);
    }
}
