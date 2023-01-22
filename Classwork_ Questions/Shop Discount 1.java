import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int quantity = scn.nextInt();
        int totalcost = quantity*100;
        
        if(totalcost>1000){
            int discount = (totalcost*10)/100;
            totalcost-=discount;
        }
        System.out.println(totalcost);
    }
}
