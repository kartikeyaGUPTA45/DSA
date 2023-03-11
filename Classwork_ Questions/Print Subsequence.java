import java.io.*;
import java.util.*;

public class Solution {
    public static void printSubsequence(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return ;
        }
        
        char ch = ques.charAt(0);
        String ros = ques.substring(1);
        
//         Include
        printSubsequence(ros, ans+ch);
//         Exclude
        printSubsequence(ros,ans);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String ques = scn.nextLine();
        
        printSubsequence(ques, "");
        
    }
}
