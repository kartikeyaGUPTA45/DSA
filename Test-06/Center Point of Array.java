import java.io.*;
import java.util.*;

public class Solution {
  public static int centerPointOfArray(int arr[])
	{
		int i, j;
		int leftsum, rightsum;
		for (i = 0; i < n; ++i) {
			leftsum = 0;
			for (j = 0; j < i; j++)
				leftsum += arr[j];
			rightsum = 0;
			for (j = i + 1; j < n; j++)
				rightsum += arr[j];
			if (leftsum == rightsum)
				return i;
		}
		return -1;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
      
		System.out.println(centerPointOfArray(arr))
        
    }
}
