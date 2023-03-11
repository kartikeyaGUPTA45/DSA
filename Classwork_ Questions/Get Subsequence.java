import java.io.*;
import java.util.*;

public class Solution {
    
    public static ArrayList<String> getSubsequence(String str){
        
        if(str.length () == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch = str.charAt(0);
        String substr = str.substring(1);
        
        ArrayList<String> subAns = getSubsequence(substr);
        
        ArrayList<String> ans = new ArrayList<>();
        
//         Exclude a character
        for(int i=0;i<subAns.size(); i++){
            ans.add(subAns.get(i));
        }
        
//         Include the character
        for(int i=0;i<subAns.size(); i++){
            ans.add(ch + subAns.get(i));
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(getSubsequence(str));
    }
}
