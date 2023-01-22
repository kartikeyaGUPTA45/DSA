import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            
            while(n1 % n2 != 0){               
                int rem = n1 % n2;
                n1 = n2;
                n2 = rem;
            }
        System.out.println(n2);
    
    }
}
