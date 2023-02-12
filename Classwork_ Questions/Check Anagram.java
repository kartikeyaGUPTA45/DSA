import java.io.*;
import java.util.*;

public class Solution {

    public static String checkAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return "False";
        }
        
        int freq[] = new int[26];
        
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            int index = ch-'a';
            freq[index]++;
        }
        
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            int index = ch-'a';
            freq[index]--;
        }
        
        for(int i=0;i<26;i++){
            if(freq[i] != 0){
                return "False";
            }
        }
        
        return "True";
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        
        System.out.println(checkAnagram(str1,str2));
    }
}
