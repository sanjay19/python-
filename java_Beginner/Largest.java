

import java.util.*;
import java.lang.*;
public class Largest {

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>b)&&(a>c))
           System.out.println(a);
        if(a<c)
            System.out.println(c);
        if(a<b)
            System.out.println(b);
           
    }
}
