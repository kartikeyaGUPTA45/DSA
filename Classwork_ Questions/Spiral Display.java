import java.io.*;
import java.util.*;

public class Solution {
    
    public static void spiralDisply(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        
        int rmin =0,cmin=0;
        int rmax=n-1,cmax=m-1;
        int counter=0;
        
        while(counter <m*n){
            
//         Vertically down
        for(int i=rmin;i<=rmax && counter<m*n;i++){
            System.out.println(arr[i][cmin]);
            counter++;
        }
        cmin++;
        
//         Horizontally left to right
        for(int i=cmin;i<=cmax&& counter<m*n;i++){
            System.out.println(arr[rmax][i]);
            counter++;
        }
        rmax--;
        
//         Vertically UP
        for(int i=rmax;i>=rmin&& counter<m*n;i--){
            System.out.println(arr[i][cmax]);
            counter++;
        }
        cmax--;
        
        
//         Horizontally  right to left
        
        for(int i=cmax;i>=cmin&& counter<m*n;i--){
            System.out.println(arr[rmin][i]);
            counter++;
        }
        rmin++;
        }
        
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int arr[][] = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        spiralDisply(arr);
    }
}
