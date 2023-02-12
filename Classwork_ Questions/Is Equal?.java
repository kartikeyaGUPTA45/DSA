import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isEqual(String str1,String str2){
        
        if(str1.length()!=str2.length()){
            return false;
        }
        
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        
        System.out.println(isEqual(str1,str2));
    }
}
