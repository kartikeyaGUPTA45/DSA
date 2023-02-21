import java.io.*;
import java.util.*;

public class Solution {
public static void replaceWithASCII(String str){
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(i%2!=0){
            System.out.print((char)(ch-1));
        }
        else{
            System.out.print((char)(ch+1));
        }
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        replaceWithASCII(str);
        
    }
}
