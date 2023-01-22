import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        
        int n=scn.nextInt();
        int count=0;
        
        while(n>0){
            count+=1;
            n/=10;
        }
        
        System.out.println(count);
    }
}
