import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(),cnt=0;
        int a[]=new int[n];
        int b[]=new int[n];
        b[0]=1;
        b[1]=1;
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
            if(i>=2) b[i]=b[i-1]+b[i-2];
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]==b[j]){
                j++;
                cnt++;
          }
        }
        System.out.println(cnt);
       
    }
}
