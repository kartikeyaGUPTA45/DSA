import java.io.*;
import java.util.*;

public class Solution {
    public static void searchCharacter(char arr[],char ch){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ch){
                System.out.print(++ch);
                return ;
            }
            
        }
        
        System.out.println(-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        char ch =  scn.next().charAt(0);
        
        int n = scn.nextInt();
        char arr [] = new char[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.next().charAt(0);
        }
        
        searchCharacter(arr,ch);
    }
}
