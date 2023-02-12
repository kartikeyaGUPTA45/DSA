import java.io.*;
import java.util.*;

public class Solution {
    
    public static void generateSubArrays(int arr[]){
        
        for(int i=0;i<arr.length;i++){ // starting point
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                }
            System.out.println();
            }
            
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        generateSubArrays(arr);
    }
}
