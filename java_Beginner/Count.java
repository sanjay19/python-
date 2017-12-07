
import java.util.*;
import java.lang.*;

public class Count {
   
 public static void main(String[] args) {
     int n,a=0;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     if(n==0)
         n=1;
     if(n<0)
         n=n*-1;
    while(n>0)
     {
        n=n/10; 
        a++;
     }
     System.out.println(a);
       
       
    }
}
