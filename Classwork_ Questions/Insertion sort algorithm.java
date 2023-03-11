import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isGreater(int arr[],int i,int j){
        if(arr[i] > arr[j]) return true;
        return false;
    }
    
    public static void swap(int arr[], int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void insertionSort(int arr[]){
        int n =arr.length;
        for(int i =1; i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(isGreater(arr,j,j+1)){
                    swap(arr,j,j+1);
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        insertionSort(arr);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
