import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    
    
    int ans=0;
    int p=1;
    int temp=n;
    int count=0;
    while(temp>0){
        count++;
        temp/=10;
    }
    int c1=count;
    while(n>0){
        int rem=n%10;
        ans+=count*Math.pow(10,c1-rem);
        n/=10;
        count--;
    }
    
    System.out.print(ans);
    
    
  }
}
