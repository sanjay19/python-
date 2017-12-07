

import java.util.*;
import java.lang.*;
public class Sum {

    public static void main(String[] args) {
       int sum=0,n,i;
        
   Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
            sum=sum+i;
        System.out.println(sum);
    }
}
