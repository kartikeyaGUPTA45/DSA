import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dice = scn.nextInt();
        int count = countWays(n,dice);
        ArrayList<String> str = paths(n,dice);
        System.out.println(count);
        System.out.println(str);
        printPaths(n,dice,"");
    }
    public static int countWays(int n, int dice){
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        int count = 0;
        for(int i = 1; i <= dice; i++){
            count += countWays(n-i,dice);
        }
        return count;
    }
    public static ArrayList<String> paths(int n, int dice){
        
        if(n < 0){
            return new ArrayList<>();
        }else if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> myres = new ArrayList<>();
        for(int i = 1; i <= dice; i++){
            ArrayList<String> path = paths(n-i,dice);
            for(String rstr:path){
                myres.add(i+rstr);
            }
        }
        return myres;
        
    }
    public static void printPaths(int n, int dice, String asf){
        
        if(n == 0){
            System.out.println(asf);
        }else if(n < 0){
            return;
        }
        for(int i = 1; i <= dice; i++){
            printPaths(n-i,dice,asf+i);
        }
    }
    
}
