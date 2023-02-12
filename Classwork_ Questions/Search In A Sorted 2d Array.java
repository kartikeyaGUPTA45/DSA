import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int [n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int x = scn.nextInt();
        
        int i=0, j =n-1;
        while(i< n && j>=0){
            if(x == arr[i][j]){
            System.out.println(i);
            System.out.println(j);
            return;
            } else if(x > arr[i][j]){
            i++;
         } else {
            j--;
         }
        }
        System.out.println("Not Found");
    }
}
