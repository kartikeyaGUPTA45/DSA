import java.io.*;
import java.util.*;

public class Solution {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }

    public static void sort01(int arr[]){
        int i =0, j = 0;
        while(i < arr.length){
            if(arr[i] == 0){
                swap(arr,i,j);
                i++;
                j++;
            }else{
                i++;
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
        
        sort01(arr);
        
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
