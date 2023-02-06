import java.io.*;
import java.util.*;

public class Solution {
    public static void transpose(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int tem=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=tem;
            }
        }
    }

    public static void reverse(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
           int left=0;
           int right=n-1;
           while(left<right){
              int temp=a[i][left];
              a[i][left]=a[i][right];
              a[i][right]=temp;
        
           left++;
           right--;
           }
        }
    }
     public static void display(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
       int count=0;
       while(count<2){
            transpose(a);
            reverse(a);
            count++;
       }
        display(a);

    }
}
