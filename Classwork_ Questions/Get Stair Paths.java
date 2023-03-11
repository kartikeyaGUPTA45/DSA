import java.io.*;
import java.util.*;

public class Solution {
    public static ArrayList<String> getStairPaths(int n){
//         Negtive Base case 
        if(n < 0){
            // return new ArrayList<>();
            ArrayList<String> base2 = new ArrayList<>();
            return base2;
        }
        
//         Positive Base Case
        if(n == 0){
            ArrayList<String> base1 = new ArrayList<>();
            base1.add("");
            return base1;
        }
        
//         Taking one step -> finding all the combinations for (n-1) stairs
        ArrayList<String> oneStep = getStairPaths(n-1);
//         Taking two steps -> finding all the combinations for (n-2) stairs
        ArrayList<String> twoSteps = getStairPaths(n-2);
//         Taking three steps -> finding all the combinations for (n-3) stairs
        ArrayList<String> threeSteps = getStairPaths(n-3);
        
        
//         Final answer -> stores all the combinations
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i=0;i<oneStep.size(); i++){
            ans.add("1"+oneStep.get(i));
        }
        
        for(int i=0;i<twoSteps.size();i++){
            ans.add("2"+twoSteps.get(i));
        }
        
        for(int i=0;i<threeSteps.size();i++){
            ans.add("3"+threeSteps.get(i));
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(getStairPaths(n));
    }
}
