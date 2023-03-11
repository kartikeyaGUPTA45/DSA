import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printEncoding(String ques, String ans){
        
        if(ques.length() == 0){
            System.out.println(ans);
            return ;
        }
        
        // String ch1 = ques.substring(0,1);
        char ch1 = ques.charAt(0);
        if (ch1 == '0') {
//             No encoding possible
            return ;
        }
        
        String ros1 = ques.substring(1);
        printEncoding(ros1, ans + (char)(Integer.parseInt(ch1+"")-1+'a'));
        
        if(ques.length() >=2){
            String ch2 = ques.substring(0,2);
            String ros2 = ques.substring(2);
            if(Integer.parseInt(ch2) <=26){
                printEncoding(ros2, ans + (char)(Integer.parseInt(ch2)-1+'a'));
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        printEncoding(str, "");
    }
}
