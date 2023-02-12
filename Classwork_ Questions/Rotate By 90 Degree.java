import java.io.*;
import java.util.*;

public class Solution {
    
    public static void transpose(int arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    
    public static void reverseThe2Darray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int left=0;
            int right=arr.length-1;
            
            while(left<right){
                int temp =arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                
                left++;
                right--;
            }
        }
    }
    
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        transpose(arr);
        reverseThe2Darray(arr);
        display(arr);
    }
}
