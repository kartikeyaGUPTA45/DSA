import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        
        return false;
    }

    public static void printIndicesOfVowel(String str){
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(checkVowel(ch) == true){
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        printIndicesOfVowel(str);
    }
}
