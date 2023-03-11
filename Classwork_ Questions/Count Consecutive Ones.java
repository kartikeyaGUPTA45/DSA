import java.io.*;
import java.util.*;

public class Solution {
    public static int maxConsecutiveOnes(String str){
        int maxLen = 0, count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1') count++;
            else{
                if(count>maxLen) maxLen = count;
                count = 0;
            }
        }
        
        if(count > maxLen) maxLen = count;
        
        return maxLen;
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(maxConsecutiveOnes(str));
    }
}
