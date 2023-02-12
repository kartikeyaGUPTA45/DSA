import java.io.*;
import java.util.*;

public class Solution {
public static String replacementInReverse(String str){
      String ans = "";
      for (int i=0; i<str.length();i++){
          char ch = str.charAt(i);
          if(ch>='A' && ch<='Z'){
              ans += (char)('Z'-(ch-'A'));

          }else if (ch>='a' && ch <= 'z'){
               ans += (char)('z'-(ch-'a'));
          }else if(ch >= '0' && ch <= '9'){
              ans += (char)('9'-(ch-'0'));
          }else{
              ans+=ch;
          }
      }

      return ans;
}

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner scn = new Scanner(System.in);
  String str = scn.nextLine();
  System.out.println(replacementInReverse(str));
   
}
