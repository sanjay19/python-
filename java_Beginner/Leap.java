
import java.util.*;
import java.lang.*;

public class Leap {

    public static void main(String[] args) {
       int a ;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       if(a>0)
       {
       if((a%400==0)||(a%4==0)&&(a%100==0))
           System.out.println("leap year");
       else
           System.out.println("not leap year");
    }
       
    }
}
