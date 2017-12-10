
import java.util.*;
import java.lang.*;

public class Eveni {

   
    public static void main(String[] args) {
       
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
           if(i%2==0)
               System.out.println(i);
        }
       
    }
}


