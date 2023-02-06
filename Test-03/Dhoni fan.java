import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
     int a[]=new int[n];  
    int i,j,k;
    for(i=0;i<n;i++)
    {
        a[i]=scn.nextInt();
    }
        int cnt=0;
    for(i=0;i<n;i++)
    {
        for(j=i;j<n;j++)
        {
            for(k=i;k<=j;k++)
            {
               if(a[k]==7)
               {
                   cnt++;
                   break;
               }
            }
              
        }
             
        

    }
        System.out.print(cnt);
    }
}
