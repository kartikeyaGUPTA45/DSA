import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isSmaller(int arr[], int j,int minIdx){
        if(arr[j] < arr[minIdx]){
            return true;
        }
        return false;
    }
    
    public static void swap(int arr[],int i,int minIdx){
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
    
    public static void selectionSort(int arr[]){
        int n =arr.length;
        
        for(int i=0;i<n;i++){
            int minIdx = i;
            for(int j = i+1;j<n;j++){
                if(isSmaller(arr,j,minIdx)){
                    minIdx = j;
                }
            }
            swap(arr,i,minIdx);
            
        }
    }
   
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        selectionSort(arr);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
