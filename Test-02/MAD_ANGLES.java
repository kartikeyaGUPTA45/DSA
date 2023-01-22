

import java.util.Scanner;

public class Solution {	
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i < n ; i++){
//             print n stars
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.print("  ");
//             print downward triangle line
            for(int j = 0 ; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*(n - i) - 1; j++){
                System.out.print("*");
            }
            System.out.print("  ");
//             print upward triangle
            for(int j = 0; j < 2*( i  + 1) - 1; j++){
                System.out.print("*");
            }
            System.out.print("  ");
//             print downward triangle
            for(int j = 0; j < 2*(n - i) - 1; j++){
                System.out.print("*");
            }
            
            for(int j = 0 ; j < i; j++){
                System.out.print(" ");
            }
            System.out.print("  ");
//             print rectangle
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        // write your code here
    }

    public static void printStars(int n){
        for(int i = 1 ; i <= n ;i++){
            System.out.print("*");
        }
    }

    public static void printSpaces(int n){
        for(int i = 1 ; i <= n ;i++){
            System.out.print(" ");
        }
    }
}
