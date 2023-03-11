import java.io.*;
import java.util.*;

public class Solution {
    public static String arr[] = {".;", "abc","def","ghi", "jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str){
        
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> subAns = getKPC(ros);
        
        ArrayList<String> ans = new ArrayList<>();
        int index = ch -'0';
        String code = arr[index];
        
        for(int i=0;i<code.length();i++){
            char c = code.charAt(i);
            for(int j=0;j<subAns.size();j++){
                ans.add(c+subAns.get(j));
            }
        }
        
        return ans;
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(getKPC(str));
    }
}
