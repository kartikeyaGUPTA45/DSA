import java.io.*;
import java.util.*;

public class Solution {
    
    public static String compareMatrices(int a[][],int b[][]){
        int n1=a.length;
        int m1=a[0].length;
        int n2=b.length;
        int m2=b[0].length;
        
        if(n1!=n2 || m1!=m2){
            return "Not Same";
        }
        
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                if(a[i][j] != b[i][j]){
                    return "Not Same";
                }
            }
        }
        
        return "Same";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        
        int a[][] = new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                a[i][j] = scn.nextInt();
            }
        }
        
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        
        int b[][] = new int[n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                b[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(compareMatrices(a,b));
        
        
    }
}
