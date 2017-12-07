
import java.util.*;
import java.lang.*;

public class Power {

    
    public static void main(String[] args) {
       int n,p,sum=1;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       p=sc.nextInt();
       for(int i=0;i<p;i++)
       
           sum=sum*n;
       
           System.out.println(sum);
       
    }
}
