

import java.util.*;
import java.lang.*;
public class Prime {

    public static void main(String[] args) {
       int n,s;
       boolean flag=true;
               
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       for(int i=2;i<n/2;i++)
       {
           s=n%i;
           if(s==0)
           {
           flag=false;
           break;
       }
       }
       if(flag)
       
           System.out.println("prime");
           else
           System.out.println("not prime");
       }
       
      
    }

