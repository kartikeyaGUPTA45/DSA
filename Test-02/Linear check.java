import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        
        // code here
        for(int i=0; i<n-1; i++){
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            
            if(n1 != a1 && n2!=a2){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
