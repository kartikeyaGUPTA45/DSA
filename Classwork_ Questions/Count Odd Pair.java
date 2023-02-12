import java.io.*;
import java.util.*;

public class Solution {
    public static void printOddPairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum%2!=0){
                    System.out.println(arr[i]+" "+arr[j]);
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
            arr[i]=scn.nextInt();
        }
        
        printOddPairs(arr);
    }
}
