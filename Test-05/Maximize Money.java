import java.io.*;
import java.util.*;

public class Solution {
    
    public static String maximizeMoney(String str1, String str2){
        if(str1.length() == 1 && str1.charAt(0) == '0') return str2;
        if(str2.length() == 1 && str2.charAt(0) == '0') return str1;
        
        int ans[] = new int[str1.length() + str2.length()];

        int k=0;
    
        for (int i = str1.length() - 1; i >= 0; i--)
        {
            int carry = 0,n1 = str1.charAt(i) - '0',m = 0; 
            for (int j = str2.length() - 1; j >= 0; j--)
            {
                int n2 = str2.charAt(j) - '0';
                int sum = n1 * n2 + ans[k + m] + carry;
                carry = sum / 10;
                ans[k + m] = sum % 10;
                m++;
            }
            
            if (carry > 0)
                ans[k + m] += carry;
            k++;
        }

        int i = ans.length - 1;
        while (i >= 0 && ans[i] == 0) i--;

        if (i == -1) return "0";
        
        String strAns = "";
        while (i >= 0)
            strAns += (ans[i--]);

        return strAns;
    }

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        
        System.out.println(maximizeMoney(str1,str2));
    }
}
