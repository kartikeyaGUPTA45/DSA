import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        char alpha = 'A';
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(alpha + "\t");
                System.out.print(count + "\t");
                count++;
                alpha++;
            }
            System.out.println();
        }
    }
}
