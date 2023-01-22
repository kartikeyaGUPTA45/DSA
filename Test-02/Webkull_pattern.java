import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // code here
        
        for(int i=1; i<=n ; i++){
            System.out.print("@");
        }
        System.out.println();
        
        int stars = 1;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-1; j++){
            System.out.print(" ");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            if(i<=n/2){
                stars++;
            }
            else{
                stars--;
            }
            System.out.println();
        }
        
        
        
        for(int i=1; i<=n-2; i++){
            System.out.print(" ");
        }
        for(int i=1; i<=n ; i++){
            System.out.print("@");
        }
    }
}
