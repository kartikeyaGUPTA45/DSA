import java.io.*;
import java.util.*;

public class Solution {
    public static void mergeTwoSortedArrays(int a1[], int a2[]){
        
        int n1 = a1.length, n2 = a2.length;
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        int a[] = new int[n1+n2];
        
        
        while(i<n1 && j<n2){
            if(a1[i] > a2[j]){
                a[k] = a2[j];
                j++;
            }else{
                a[k] = a1[i];
                i++;
            }
               k++;
        }
        
        while(i < n1){
            a[k] = a1[i];
            k++;
            i++;
        }
        
        while(j < n2){
            a[k] = a2[j];
            j++;
            k++;
        }
        
        for(i =0 ;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int a1[]= new int[n1];
        
        for(int i=0;i<n1;i++){
            a1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int a2[]= new int[n2];
        
        for(int i=0;i<n2;i++){
            a2[i] = scn.nextInt();
        }
        
        mergeTwoSortedArrays(a1,a2);
    }
}
