import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i,j;
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                a[i][j]=scn.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0||i==n-1||i+j==n-1)
                    System.out.print(a[i][j]+" ");
            }
        }
    }
}
