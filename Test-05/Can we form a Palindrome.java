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
        int[] a=new int[130];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
        }int o=0;
        for(int i=0;i<130;i++)
            if(a[i]%2!=0)o++;
        if(o>1)
            System.out.println("False");
        else
             System.out.println("True");
    }
}
