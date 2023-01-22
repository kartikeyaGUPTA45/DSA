import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int nst=n, nsp=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                if(i >1 && i<=n/2  && j>1 && j<nst){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            
            if(i<=n/2){
                nst-=2;
                nsp+=1;
            }else{
                nst+=2;
                nsp-=1;
            }
            System.out.println();
        }
    }
}
