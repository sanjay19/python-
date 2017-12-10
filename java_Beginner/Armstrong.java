

import java.util.*;
import java.lang.*;
public class Armstrong {
public static void main(String[] args) {
      int n,temp,sum=0,s;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      temp=n;
      while(temp>0)
      {
          s=temp%10;
          sum=sum+s*s*s;
          temp=temp/10;
      }
      if(n==sum)
          System.out.println("armstrong");
      else
          System.out.println("not armstrong");
    }
}
