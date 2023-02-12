import java.io.*;
import java.util.*;

public class Solution {
    
    public static String toggleCase(String str){
        String ans = "";
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch >= 'a' && ch <= 'z'){
                ans += (char)(ch-'a'+'A');
            }else{
                ans+= (char)(ch-'A'+'a');
            }
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(toggleCase(str));
    }
}
