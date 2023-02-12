import java.io.*;
import java.util.*;

public class Solution {
    
    public static void swap(int left,int right,int arr[]){
        
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    
    public static void reverseTheArray(int arr[]){
        int left = 0;
        int right = arr.length-1;
        
        while(left < right){
            swap(left,right,arr);
            
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt(); 
        }
        
        reverseTheArray(arr);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
