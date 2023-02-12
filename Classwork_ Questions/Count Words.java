import java.io.*;
import java.util.*;

public class Solution {
    
    public static int countWords(String str){
        int count=0;
        for(int i =0 ;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        
        return count+1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(countWords(str));
    }
}
