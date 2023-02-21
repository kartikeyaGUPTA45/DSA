import java.io.*;
import java.util.*;

public class Solution {
     public static int removeHi(String str, int idx, String asf) {
        if (idx == str.length()) {
            System.out.println(asf);
            return 0;
        }
        if (idx < str.length() - 1 && str.charAt(idx) == 'h' && str.charAt(idx + 1) == 'i')
            return removeHi(str, idx + 2, asf) + 1;

        return removeHi(str, idx + 1, asf + str.charAt(idx));
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        // int n=scn.nextInt();
        
        System.out.println(removeHi(s,0,""));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
