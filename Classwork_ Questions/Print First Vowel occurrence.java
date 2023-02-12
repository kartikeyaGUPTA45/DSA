import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean checkVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch =='u' || ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        
        return false;
    }

    public static int firstVowelOccurence(char arr[]){
        
        for(int i=0;i<arr.length;i++){
            if(checkVowel(arr[i])){
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char arr [] = new char[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.next().charAt(0);
        }
        
        int index = firstVowelOccurence(arr);
        System.out.println(index);
    }
}
