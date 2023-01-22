import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int r = n*2-1;
        
        for(int i=0;i<r;i++){
            int a = n;
            if(i<=r/2){
                for(int j=0;j<r;j++){
                    if(a%2==0){
                        System.out.print(a+"\t");
                    }else{
                        System.out.print("#\t");
                    }
                    if(j<i){
                        a--;
                    }
                    else if(j>r-i-2) {
                        a++;
                    }
                }
            }else{
                for(int j=0;j<r;j++){
                    if(a%2==0){
                        System.out.print(a+"\t");
                    }else{
                        System.out.print("#\t");
                    }
                    if(j<r-i-1){
                        a--;
                    }
                    else if(j>i-1) {
                        a++;
                    }
                }
            }
            System.out.println();
        }
    }
}
