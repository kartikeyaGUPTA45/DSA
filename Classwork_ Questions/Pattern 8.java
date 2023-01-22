import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int val=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
}
