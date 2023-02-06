import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scn=new Scanner(System.in);
        int row=scn.nextInt();
         int col=scn.nextInt();
         int A [][]=new int [row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
               A[i][j]=scn.nextInt();
        }
        int i=0,j=0;
        int dir=0;
        while(true)
        {
            
            dir=(dir+(A[i][j]))%4;
            if(dir==0)
                j++;
            else if(dir==1)
                i++;
            else if(dir==2)
                j--;
            else if(dir==3)
                i--;
            if(i<0)
               { i++;
               break;}
            else if(j<0)
                {j++;
                break;}
            else if(i==row)
               { i--;
               break;}
            else if(j==col)
                {j--;
                break;}
        }
        System.out.println(i);
        System.out.println(j);
    }
}
