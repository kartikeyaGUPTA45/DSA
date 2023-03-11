import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name =in.nextLine();
        String typed =in.nextLine();
        boolean result = isLongPressedName(name, typed);
        System.out.println(result);
    }

    private static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) { // matching character
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) { 
                j++;
            } else {
                return false; 
            }
        }
        if (i != name.length()) { // some characters in name are not present in typed
            return false;
        }
        while (j < typed.length()) { // check if any additional long pressed characters are present
            if (typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }
        return true;
    }
}
