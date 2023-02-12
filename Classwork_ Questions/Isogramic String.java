import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean checkIsogram(String str){
        
        int freq[] = new int[26];
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int index = ch-'a';
            freq[index]++;
        }
        
        for(int i=0;i<26;i++){
            if(freq[i]>1){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        boolean ans = checkIsogram(str);
        
        if(ans == true){
            System.out.println("Isogram");
        }else{
            System.out.println("Not an Isogram");
        }
       
    }
}
