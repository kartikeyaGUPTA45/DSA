import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n / 2;
        int oval = 1;
        for(int i = 1; i <= n; i++){
            int val = oval;
            for(int j = 1;  j <= spaces; j++){
                System.out.print("  ");
            }
            for(int j = 1;  j <= stars; j++){
                System.out.print(val + " ");
                if(j <= stars / 2){
                    val++;
                }else{
                    val--;
                }
            }
            System.out.println();
            if(i <= n / 2){
                oval++;
                stars += 2;
                spaces--;
            }else{
                oval--;
                stars -= 2;
                spaces++;
            }
        }
    }
}
