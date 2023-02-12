import java.io.*;
import java.util.*;

public class Solution {
    public static int maxDistance(String str){
        int maxDistance =-1;
        char ch='a';
        for(int i=1;i<str.length();i++){
           if(str.charAt(i)-ch==1||str.charAt(i)>'a'&&str.charAt(i)<=ch)
           {   
               if (str.charAt(i) > ch ) ch = str.charAt(i);
               maxDistance = i+1;
           }
            
        }
        return maxDistance;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(maxDistance(str));
    }
}
