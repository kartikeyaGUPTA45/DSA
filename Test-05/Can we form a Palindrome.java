import java.io.*;
import java.util.*;

public class Solution {
    public static String canWeFormPalindrome(String S){
      int arr[] = new int[62];
        for(int i=0;i<S.length();i++){
          char ch = S.charAt(i);
          if (ch >= 'a' && ch <='z'){
              arr[ch-'a']++;
          }else if(ch >= 'A' && ch <='Z'){
              arr[ch-'A'+26]++;
          }else {
              arr[ch-'0'+52]++;
          }
      }
        
        int countOdd = 0;
        
        for(int i=0;i<62;i++){
            if(arr[i]%2!=0){
                countOdd++;
            }
        }
      if(countOdd > 1) return "False"
      return "True";
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String S=scn.next();
        System.out.println(canWeFormPalindrome(S));
    }
}
