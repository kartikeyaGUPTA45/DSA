import java.io.*;
import java.util.*;

public class Solution {
    public static void floodFill(int maze[][], int sr,int sc,int dr,int dc,String asf, boolean visited[][]){
        if(sr < 0 || sr > dr || sc < 0 || sc > dc || maze[sr][sc] == 1 || visited[sr][sc] == true){ // Negative base case
            return ;
        }
        
        if(sr == dr && sc == dc){ // Positive base case
            System.out.println(asf);
            return ;
        }
        
        visited[sr][sc] = true;
        floodFill(maze,sr-1,sc,dr,dc,asf + 't',visited);
        floodFill(maze,sr,sc-1,dr,dc,asf + 'l',visited);
        floodFill(maze,sr+1,sc,dr,dc,asf + 'd',visited);
        floodFill(maze,sr,sc+1,dr,dc,asf + 'r',visited);
        visited[sr][sc] = false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int maze[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maze[i][j] = scn.nextInt();
            }
        }
        boolean visited[][] = new boolean [n][m];
        
        floodFill(maze,0,0,n-1,m-1,"",visited);
    }
}
