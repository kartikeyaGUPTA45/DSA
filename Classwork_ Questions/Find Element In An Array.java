import java.io.*;
import java.util.*;

public class Solution {
    public static int linearSearch(int arr[],int d){
        int n =arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i] == d){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int d=scn.nextInt();
        
        int index = linearSearch(arr,d);
        System.out.println(index);
    }
}
