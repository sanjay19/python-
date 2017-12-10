

import java.util.*;
import java.lang.*;
public class Primei {

    public static void main(String[] args) {
int m,n;

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
               

        while (n < m) {
            boolean flag = false;

            for(int i = 2; i <= n/2; i++) {
               
                if(n % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(n + " ");

            n++;
        }
    }
}

    

