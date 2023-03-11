import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isSmaller(int arr[] ,int i,int j){
        if(arr[i] > arr[j]){
            return true;
        }
        return false;
    }
    
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int itr =1; itr<n;itr++){
            for(int j = 0; j<n - itr;j++){
                if(isSmaller(arr, j, j+1)){
                    swap(arr,j,j+1);
                }
            }
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        bubbleSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
