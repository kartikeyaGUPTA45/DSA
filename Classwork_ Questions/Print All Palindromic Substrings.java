import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void generateSubstrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String substring ="";
                for(int k=i;k<=j;k++){
                    substring+=str.charAt(k);
                }
                boolean ans = checkPalindrome(substring);
                if(ans == true){
                    System.out.println(substring);
                } 
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        generateSubstrings(str);
    }
}
