import java.io.*;
import java.util.*;

public class Solution {
    
    public static int [] mergeTwoSortedArrays(int a[] ,int b[]){
        
        int ans [] = new int[a.length+b.length];
        
        int i = 0,j=0,k=0;
        
        while(i < a.length && j < b.length){
            
            if(a[i] > b[j]){
                ans[k] = b[j];
                j++;
                k++;
            }else{
                ans[k] = a[i];
                i++;
                k++;
            }
        }
        
        while(i < a.length){
            ans[k] = a[i];
            i++;
            k++;
        }
        
        while(j < b.length){
            ans[k] = b[j];
            j++;
            k++;
        }
        
        
        return ans;
    }
    
    public static int [] mergeSort(int arr[], int low,int high){
        if(low == high){
            int base [] =new int[1];
            base[0] = arr[low];
            return base;
        }
        
        int mid = (low+high)/2;
        
        int fh [] = mergeSort(arr,low,mid);
        int sh [] = mergeSort(arr,mid+1,high);
        return mergeTwoSortedArrays(fh,sh);
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        arr = mergeSort(arr, 0 ,n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
